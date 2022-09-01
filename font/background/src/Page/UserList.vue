<template>
  <div>
    <div class="div_list" v-for="user in userLists" :key="user.id">
<!--      返回的用户信息-->

      <span>昵称：{{user.userName}}</span>
      <span>账号：{{user.userAccount}}</span>
      <span>性别：{{user.gender}}</span>
      <span>邮箱：{{user.email}}</span>
      <span :data-id="user.id">
        <button v-on:click="ban">{{user.isDelete}}</button>
      </span>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "UserList",
  data: function (){
    return{
      userLists: [
        {
          id: 0,
          userName: '',
          userAccount: '',
          gender: 1,
          email: '',
          isDelete: 1
        }
      ]
    }
  },
  mounted() {
    this.axios.get('/search/userList').then(
        response => {
          this.userLists = response.data
          for (var i = 0; i<this.userLists.length;i++){
            if (this.userLists[i].gender===1) {
              this.userLists[i].gender = '男'
            }
            else {
              this.userLists[i].gender = '女'
            }
            if (this.userLists[i].isDelete===1){
              this.userLists[i].isDelete = '禁用'
            }
            else {
              this.userLists[i].isDelete = '启用'
            }
          }
        },
        error => {alert(error)}
    )
  },
  methods: {
    ban(e){
      //this.axios.post('/update/ban',{"id":this})
      var status
      if (e.target.innerText === '禁用'){
        status = 1
      }else {
        status = 0
      }
      this.axios.post('/update/ban',{"id":e.target.parentNode.dataset.id,"isDelete":status}).then(
          response => {
            if (response.data.code=== 1){
              alert("状态更改成功")
            }
          },
          error => {alert(error)}
      )

    }
  }
}
</script>

<style scoped lang="css">
.div_list {
  width: 824px;
  height: 80px;
  border: 2px solid red;
  margin-top: 40px;
  font-size: 15px;
  font-weight: bold;
}
.div_list span {
  display: inline-block;
  width: 140px;
  height: 80px;
  line-height: 80px;
}
span button {
  color: red;
}

</style>