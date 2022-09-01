<template>
  <div class="div_d1">
    <div class="div_d2">
      <img src="../static/img/相册.jpeg">
    </div>
    <div class="div_d3">
      <input type="text" v-model:value="a">
      <br>
      <button v-on:click="newA">确定新建</button>

    </div>

  </div>
</template>

<script>
export default {
  name: "NewAlbum",
  data: function (){
    return{
      a:''
    }
  },
  methods: {
    newA(){
      this.axios.post('album/built',{"albumZoneName":this.a}).then(
          response => {
            if (response.data === 1){
              alert("新建成功")
            }
          },
          error => {console.log('失败了',error);}
      )
    }
  }
}
</script>

<style scoped lang="css">
.div_d1 {
  width: 823px;
  height: 267px;
  margin-top: 170px;
}
.div_d2 {
  float: left;
  width: 250px;
  height: 267px;
  margin-left: 120px;
  background-color: #873d24;
}
.div_d2 img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
.div_d3 {
  float: left;
  width: 276px;
  height: 267px;
  margin-left: 100px;
  border: 3px solid #b5f0fe;
  
}
.div_d3 input {
  width: 212px;
  height: 42px;
  margin: 90px auto 40px;
  border: none;
  border-bottom: 3px solid #a4b756;
  text-indent: 1em;

}
.div_d3 button {
  width: 140px;
  height: 50px;
  border: none;
  border-radius: 50px;
  font-size: 20px;
  font-weight: bold;
  font-family: KaiTi;
  background-image: linear-gradient(to right, #74ebd5, #acb6e5);
}

</style>