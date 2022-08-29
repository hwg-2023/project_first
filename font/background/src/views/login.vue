<template>
<div>
  <div class="div_top" v-show="result">
    <!--    写四个背景图片（小的）-->
    <ul>
      <li><img src="~@/static/img/wallhaven-l3jg9l_1920x1080.png" alt="找不到图片哦" v-on:click="change"></li>
      <li><img src="~@/static/img/wallhaven-3zkopy_1920x1080.png" alt="找不到图片哦" v-on:click="change"></li>
      <li><img src="~@/static/img/wallhaven-72rd8e_1920x1080.png" alt="找不到图片哦" v-on:click="change"></li>
      <li><img src="~@/static/img/wallhaven-lqlrpl_1920x1080.png" alt="找不到图片哦" v-on:click="change"></li>
    </ul>
    <img src="../static/icon/关闭.png" alt="找不到图片哦" title="点击关闭" v-on:click="close1">
  </div>
  <div class="div_icon" v-on:click="show">
    <img src="../static/icon/皮肤.png" alt="找不到图片哦" title="点我换肤">
  </div>
  <div class="div_head">
    <h1>在线相册</h1>
  </div>
  <div class="div_big">
      <h1>
        <router-link to="/Login_1">登录</router-link>&nbsp;|&nbsp;<router-link to="/Register">注册</router-link>
      </h1>
        <router-view></router-view>
  </div>
</div>
</template>

<script>

export default {
  name: "login",
  components: {},

  data: function (){
    return{
      result: false
    }
  },
  methods: {
    show(){
      this.result = true
    },
    close1(){
      this.result = false
    },
    change(e){
      document.body.style.backgroundImage = 'url("'+e.target.src+'")'
    }
  }
}
</script>

<style scoped lang="css">
@import "~@/assets/login.css";
</style>