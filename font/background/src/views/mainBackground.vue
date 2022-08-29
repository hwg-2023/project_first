<template>
  <div class="div_main">
    <div class="div_left">
      <div class="div1_top">
        <img src="../static/icon/布偶猫-稀有色.png" alt="找不到图像哦">
        <h1>MF</h1>
      </div>
      <div class="div1_center">
        Dashboard
      </div>
      <ul>
        <li>
          <router-link to="/mainBackground/Fan">我的追番</router-link>
        </li>
        <li>
          <router-link to="/mainBackground/Ju">我的追剧</router-link>
        </li>
        <li>
          <router-link to="/mainBackground/Book">我的电子书</router-link>
        </li>
      </ul>

    </div>
    <div class="div_center">
      <div class="div2_tops">
        <input type="text" placeholder="Search + Enter">
        <img src="" alt="">
      </div>
      <div class="div2_top">

      </div>
      <div class="div2_bottom">
        <router-view></router-view>
      </div>
    </div>
    <div class="div_right">
      <div class="div3_top">
        无边萧木望东流
      </div>

    </div>

  </div>
</template>

<script>
export default {
  name: "mainBackground",
  data: function (){
    return{

    }
  },
  methods: {
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
    background-image: url("../static/icon/主页-5.png");
    background-repeat: no-repeat;
    background-position: 25px center;
    text-align: center;
    line-height: 80px;
    font-weight: 700;
    font-size: 19px;
    color: #dcbdff;
  }
  .div_left ul li {
    list-style: none;
    width: 214px;
    height: 80px;
    text-align: center;
    line-height: 50px;
    margin-top: 20px;
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
    line-height: 85px;
    background: #0F2027;  /* fallback for old browsers */
    background: -webkit-linear-gradient(to right, #2C5364, #203A43, #0F2027);  /* Chrome 10-25, Safari 5.1-6 */
    background: linear-gradient(to right, #2C5364, #203A43, #0F2027); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

  }
  .div_center .div2_tops input {
    width: 179px;
    height: 41px;
    margin-left: 38px;
    border: none;
    border-radius: 15px;
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
</style>