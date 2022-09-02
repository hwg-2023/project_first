<template>
  <div>
<!--    然后是注册页-->
    <input type="text" class="input1" placeholder="Account" v-model:value="account">
    <div class="div_design">
      <input type="text" placeholder="Phone number">
      <button v-on:click="time" :disabled="cannot">{{msg}}</button>
    </div>


    <input type="password" class="input1" placeholder="Identifying code">

    <input type="password" class="input1" placeholder="Password" v-model:value="password">
    <button class="btn1" v-on:click="into">注册</button>
  </div>

</template>

<script>
import axios from "axios";

export default {
  name: "Register",
  data: function (){
    return{
      msg: '点击获取验证码',
      cannot: false,
      account: '',
      password: ''
    }
  },
  methods: {
    time() {
      let n = 60
      let timer = setInterval(() => {
        this.cannot = true
        this.msg = n + 's后重新发送'
        if (n <= 0) {
          clearInterval(timer)
          this.cannot = false
          this.msg = '重新发送短信'
        }
        n--

      }, 1000)
    },
      // let timer = setInterval(
      //     function (){
      //       e.target.innerText = n + 's' +' '+'后重新发送'
      //       n--
      //  },1000)
      // if (n<=0){
      //     clearInterval(timer)
      // }
    into(){
      this.axios.post('/enter/register',{"userAccount": this.account,"userPassword":this.password}).then(
          response => {
            if (response.data.code ===0){
              alert(response.data.msg)
            }else alert(response.data.msg)

          },
          error => {
            alert(error)
          }
      )
    }




  }
}
</script>

<style scoped lang="css">

</style>