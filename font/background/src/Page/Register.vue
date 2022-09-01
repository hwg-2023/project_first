<template>
  <div>
<!--    然后是注册页-->
    <input type="text" class="input1" placeholder="Account">
    <div class="div_design">
      <input type="text" placeholder="Phone number">
      <button v-on:click="time" :disabled="cannot">{{msg}}</button>
    </div>


    <input type="password" class="input1" placeholder="Identifying code">

    <input type="password" class="input1" placeholder="Password">
    <button class="btn1">注册</button>
  </div>

</template>

<script>
export default {
  name: "Register",
  data: function (){
    return{
      msg: '点击获取验证码',
      cannot: false
    }
  },
  methods: {
    time(){
      let n = 60
      let timer = setInterval(()=>{
        this.cannot = true
        this.msg = n + 's后重新发送'
        if(n<= 0){
          clearInterval(timer)
          this.cannot = false
          this.msg = '重新发送短信'
        }
        n--

      },1000)

      // let timer = setInterval(
      //     function (){
      //       e.target.innerText = n + 's' +' '+'后重新发送'
      //       n--
      //  },1000)
      // if (n<=0){
      //     clearInterval(timer)
      // }

    }


  }
}
</script>

<style scoped lang="css">

</style>