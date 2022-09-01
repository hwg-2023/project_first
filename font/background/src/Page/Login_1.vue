<template>
<div>
  <input type="text"  class="input1" name="userAccount" placeholder="Account">
  <input type="password" class="input1" name="userPassword" placeholder="Password" v-on:focus="closeEye" v-on:focusout="openEye" id="p">
  <input type="reset" value="清空" class="input2" v-on:click="clean">
  <input type="button" value="登录" class="input2" v-on:click="login">
  <div>
    <div class="image_22" id="i22"></div>
    <div class="image_33" id="i33"></div>
  </div>

  <div class="div_bottom">
    <span>忘记密码？</span>
  </div>
</div>
</template>

<script>
export default {
  name: "Login_1",
  data: function (){
    return{

    }
  },
  methods: {
    closeEye(){
      var close22 = document.getElementById('i22')
      var close33 = document.getElementById('i33')
      close22.style.backgroundImage = 'url("https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/10852/22_close.0efad8c4%E6%94%B9.png")';
      close33.style.backgroundImage = 'url("https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/10852/33_close.eea03c39%E6%94%B9.png")';
    },
    openEye(){
      var close22 = document.getElementById('i22')
      var close33 = document.getElementById('i33')
      close22.style.backgroundImage = 'url("https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/10852/22_open.72c00877%E6%94%B9.png")'
      close33.style.backgroundImage = 'url("https://xingqiu-tuchuang-1256524210.cos.ap-shanghai.myqcloud.com/10852/33_open.43a09438%E6%94%B9.png")'
    },
    clean(){
      var userAccount = document.querySelector('.input1')
      var userPassword = document.querySelector('#p')
      userAccount.value = ''
      userPassword.value = ''
    },
    login(){
      var userAccount = document.querySelector('.input1')
      var userPassword = document.querySelector('#p')
      this.axios.post('/enter/login',{"userAccount":userAccount.value,"userPassword":userPassword.value}).then(
          response => {
            if (response.data.code === 1){
              location.href= '/mainBackground/upload?userAccount='+userAccount.value
            }else {
              alert(response.data.msg)
            }
          },
          error => {
            alert("登录失败，服务器错误")
          }
      )
    }
  }
}
</script>

<style scoped>

</style>