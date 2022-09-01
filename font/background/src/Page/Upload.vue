<template>
    <div>
      <div class="form_file">
        <img src="../static/icon/云端上传.png" alt="找不到图片哦">
        <input type="file" value="点击上传图片" @change="file1">

        <div class="div_1">
          命名：
          <input type="text" v-model:value="name1">
        </div>
        <div class="div_2">
          分区：
          <select v-model:class="selected">
            <option v-for="albumClz in albumD" :key="albumClz.albumId" :value="albumClz.albumId">
              {{albumClz.albumZoneName}}
            </option>

          </select>
        </div>
        <button class="btn" v-on:click="upload">上传</button>

      </div>
    </div>
</template>

<script>
export default {
  name: "Upload",
  data: function (){
    return{
      albumD: [
        {
          albumId: 1,
          albumZoneName: ''
        }
      ],
      name1: '',
      selected: '',
      file_1: ''
    }
  },
  methods: {
    file1(e){
      this.file_1 = e.target.files[0]
    },
    upload(){
      let formData = new FormData();
      // formData.append("file",)
      // formData.append("albumZone",this.albumD.albumId)
      formData.append("file",this.file_1)
      formData.append("albumId",this.selected)
      formData.append("albumName",this.name1)

      this.axios({
        url: "/upload/image",
        method: "POST",
        headers: {
          'Content-Type': 'application/x-www-form-urlencoded'
        },
        data: formData
      }).then(
          response => {
            if (response.data.code === 1){
              alert(response.data.data)
            }
          },
          error => {
            alert(error)
          }
      )
    }
  },
  mounted() {
    this.axios.get('/search/ergodic').then(
        response => {
          this.albumD = response.data
        },
        error => {console.log('失败了',error);}
    )
  }
}
</script>

<style scoped lang="css">
.form_file {
  width: 311px;
  height: 200px;
  margin: 99px auto;
  border: 5px solid white;
  border-radius: 20px;
  text-align: center;
}
.div_1 {
  margin: 80px auto 40px;
  font-size: 20px;
  font-weight: bold;
}
.div_1 input {
  height: 20px;
  border: none;
  border-bottom: 2px solid #e7bb5e;
  text-indent: 1em;
}
.div_2 {
  font-size: 20px;
  font-weight: bold;
  margin: 20px auto 40px;
}
.div_2 select {
  width: 125px;
  height: 20px;
}
.btn {
  width: 140px;
  height: 40px;
  border: none;
  border-radius: 40px;
  font-size: 22px;
  font-weight: bold;
  background-image: linear-gradient(to right, #5433ff, #20bdff, #a5fecb);

}

</style>