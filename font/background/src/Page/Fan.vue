<template>
  <div class="div_Fan">
    <div class="div_Fan_top">
      <div v-for="page in pageSearch" :key="page.id">
        <img :src="page.url" alt="找不到图片了哦">
        <a href="#">{{page.name}}</a>
        <h6>{{page.saying}}</h6>
      </div>
    </div>
    <div class="div2_bottoms">
      <button v-for="id in ids" :key="id.index" class="div2_button" v-on:click="searchFan">
        {{id.index}}
      </button>
    </div>

  </div>

</template>

<script>
export default {
  name: "Fan",
  data: function(){
    return {
      ids: [
        {
          index: 1
        },
        {
          index: 2
        },
        {
          index: 3
        }
      ],
      pageSearch: [
        {
          id: 1,
          name: '',
          saying: '',
          url: ''
        }
      ]
    }
  },
  mounted() {
    this.$on('page1',(e)=>{
      console.log(e)
    })
  },
  methods: {
    searchFan(e){
      var pageSearch = {
        "index": e.target.innerText,
        "pageSize": 6
      }
      this.axios({
        url: 'page/fan',
        method: 'Post',
        data: pageSearch,
        header: {
          'Content-Type':'application/json'
        }
      }).then(
          //response => {this.pageSearch = response.data},
          response => {this.pageSearch = response.data.records},
          error => {console.log('失败了',error);}
      )
    }
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
    width: 176px;
    height: 244px;
    margin: 20px 20px 20px 64px;
    border: 3px solid pink;
    border-radius: 10px;
    text-align: center;

  }
  div a {
    display: block;
    font-size: 15px;
    font-weight: 700;
    text-decoration: none;
    color: #9b1e64;
  }
  div h6 {
    font-size: 10px;
    font-family: KaiTi;
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