<template>
  <div class="div_main">
    <div class="div_left">
      <div class="div1_top">
        <img src="../static/icon/布偶猫-稀有色.png" alt="找不到图像哦">
        <h1>回忆</h1>
      </div>
      <div class="div1_center">
        Dashboard
      </div>
      <div class="nav_list">
<!--        父标题-->
        <div class="nav_title">
          <router-link to="/mainBackground/userList" v-show="see">
            用户列表
          </router-link>
        </div>
        <div class="nav_title">
          <router-link to="/mainBackground/newAlbum">
            新建相册
          </router-link>
        </div>
        <div class="nav_title">
          <router-link to="/mainBackground/upload">
            上传图片
          </router-link>
        </div>
        <div class="nav_title" v-on:click="show">
          <router-link to="#">相册簿</router-link>
        </div>
<!--        子标题-->
        <div class="nav_content" v-show="toShow" v-for="arr in arr1" :key="arr.albumId">
          <router-link :to="'/mainBackground/pageReturn?albumId='+arr.albumId">
            {{arr.albumZoneName}}
          </router-link>
        </div>

      </div>

    </div>
    <div class="div_center">
      <div class="div2_tops">
        <div class="div2_1">
<!--          全局搜索框-->

          <input type="text" placeholder="Search" v-model:value="value1">
          <button>
            <router-link :to="'/mainBackground/globalSearch?content='+value1">
              搜索
            </router-link>
          </button>

        </div>

      </div>
      <div class="div2_top">

      </div>
      <div class="div2_bottom">
        <router-view></router-view>
      </div>
    </div>
    <div class="div_right">
      <div class="div3_top">
        岑林泽
      </div>
      <div class="div3_top1">
        20软件工程2班
        <img src="~@/static/icon/狗头.png" alt="找不到图片哦">
      </div>

    </div>

  </div>
</template>

<script>
export default {
  name: "mainBackground",
  data: function (){
    return{
      toShow: false,
      arr1: [
        {
          albumId: 1,
          albumZoneName: ''
        }
      ],
      see: '',
      value1: ''
    }
  },
  methods: {
    show(){
       this.toShow = true
       this.axios.get('/search/ergodic').then(
          response => {this.arr1 = response.data;},
          error => {console.log('失败了',error);}
      )
    }
  },
  mounted() {
    if (this.$route.query.userAccount === 'admin'){
      this.see = true
    }else {
      this.see = false
    }
  }
}
</script>

<style scoped lang="css">
  .div_main {
    width: 1440px;
    height: 945px;
    margin: 45px auto;
    background: #acb6e5;  /* fallback for old browsers */
    background: -webkit-linear-gradient(to right, #86fde8, #acb6e5);  /* Chrome 10-25, Safari 5.1-6 */
    background: linear-gradient(to right, #86fde8, #acb6e5); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

    border: none;
    border-radius: 30px;
    box-shadow: -10px 18px 19px 11px #86fde8;
  }
  .div_left {
    float: left;
    width: 214px;
    height: 945px;
  }
  .div_left .div1_top {
    width: 214px;
    height: 85px;
    margin-top: 55px;
  }
  .div1_top h1 {
    display: inline-block;
    margin-left: 20px;
    background-image: linear-gradient(to right, #1cefff, #c0c0aa);
    -webkit-background-clip: text;
    color: transparent;
  }
  .div_left .div1_center {
    width: 214px;
    height: 80px;
    margin-top: 30px;
    background-image: url("../static/icon/相册.png");
    background-repeat: no-repeat;
    background-position: 20px center;
    text-align: center;
    line-height: 80px;
    font-weight: 700;
    font-size: 19px;
    color: #dcbdff;
  }
  .div_left .nav_list {
    width: 214px;
    height: 673px;
    border: 1px solid red;
    text-align: center;

  }
  .div_left .nav_title {
    width: 214px;
    height: 60px;
    font-size: 20px;
    font-weight: bold;
    line-height: 60px;
    margin-top: 20px;
    color: #3c60ba;

  }
  .div_left .nav_title a {
    text-decoration: none;
    color: #3c60ba;

  }
  .div_left .nav_content {
    width: 214px;
    height: 50px;
    line-height: 50px;
  }
  .div_left .nav_content a {
    text-decoration: none;
    font-size: 15px;
    font-weight: bold;
  }
  .div_left ul li a {
    text-decoration: none;
    font-weight: 800;
    font-size: 18px;
    color: #873d24;
  }
  .div_left ul li a:hover {
    color: #1cefff;
  }
  .div_center {
    float: left;
    width: 904px;
    height: 945px;
  }
  .div_center .div2_tops {
    width: 904px;
    height: 85px;
    border: 1px solid transparent;
    background: #0F2027;  /* fallback for old browsers */
    background: -webkit-linear-gradient(to right, #2C5364, #203A43, #0F2027);  /* Chrome 10-25, Safari 5.1-6 */
    background: linear-gradient(to right, #2C5364, #203A43, #0F2027); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

  }
  .div2_tops .div2_1 {
    width: 220px;
    height: 41px;
    margin-left: 41px;
    margin-top: 22px;
  }
  .div2_1 button {
    float: right;
    height: 41px;
    width: 41px;
    border: none;
    border-top-right-radius: 15px;
    border-bottom-right-radius: 15px;
    color: #1cefff;
    font-size: 15px;
    font-weight: bolder;
  }
  .div2_1 button a {
    text-decoration: none;
    font-size: 18px;
    font-weight: bold;
  }
  .div_center .div2_tops input {
    width: 179px;
    height: 41px;
    border: none;
    border-top-left-radius: 15px;
    border-bottom-left-radius: 15px;
    text-indent: 2em;
  }
  .div_center .div2_top {
    width: 823px;
    height: 185px;
    margin: 20px auto 0;
    background-image: url("../static/img/天空一角.png");
    background-repeat: no-repeat;
  }
  .div_center .div2_bottom {
    width: 823px;
    height: 626px;
    margin: 28px auto 0;
    text-align: center;
  }
  .div_right {
    float: left;
    width: 322px;
    height: 945px;
  }
  .div_right .div3_top {
    width: 322px;
    height: 85px;
    line-height: 85px;
    text-indent: 10em;
    font-size: 17px;
    font-weight: 900;
    color: #0F2027;
    font-family: KaiTi;
  }
  .div_right .div3_top1 {
    width: 322px;
    height: 85px;
    text-indent: 3em;
    font-size: 27px;
    font-weight: 1000;
    font-family: KaiTi;
  }
</style>