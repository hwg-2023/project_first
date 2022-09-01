<template>
  <div class="div_Fan">
    <div class="div_Fan_top">
      <div v-for="album in albumArr" :key="album.id">
        <img :src="album.albumUrl" alt="找不到图片了哦">
        <h4>{{album.albumName}}</h4>
      </div>
    </div>
    <div class="div2_bottoms">
      <button class="div2_button" v-for="i in ids" :key="i.id">
        {{i.id}}
      </button>
    </div>

  </div>

</template>

<script>
export default {
  name: "GlobalSearch",
  data: function (){
    return{
      id:"",
      ids: [
        {
          id: 1
        },
        {
          id: 2
        },
        {
          id: 3
        },
        {
          id: 4
        },
        {
          id: 5
        },
        {
          id: 6
        },
        {
          id: 7
        },
        {
          id: 8
        }
      ],
      albumArr: [
        {
          id: 1,
          albumName: '',
          albumUrl: '',
          albumZone: 1
        }
      ]
    }
  },
  mounted() {

    this.axios({
      url: '/album/search',
      method: 'POST',
      data: {"content": this.$route.query.content}
    }).then(
        response => {
          this.albumArr = response.data
        },
        error => {alert("请求失败")}
    )


  },
  methods: {
  }
}
</script>

<style scoped lang="css">
.div_Fan {
  width: 823px;
  height: 626px;
}
.div_Fan .div_Fan_top {
  width: 823px;
  height: 563px;
}
.div_Fan .div_Fan_top div {
  float: left;
  width: 230px;
  height: 190px;
  margin: 43px 5px 31px 37px;
  border: 3px solid pink;
  border-radius: 10px;
  text-align: center;

}
.div_Fan_top div img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}
.div_Fan .div2_bottoms {
  width: 823px;
  height: 63px;
  margin: 0 auto;
  text-align: center;
}
.div2_bottoms button {
  width: 34px;
  height: 38px;
  margin: 5px;
}
</style>