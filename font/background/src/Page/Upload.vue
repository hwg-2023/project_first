<template>
    <div>
      <form class="form_file">
        <img src="../static/icon/云端上传.png" alt="">
        <h1>点击上传图片</h1>

        <div class="div_1">
          命名：
          <input type="text">
        </div>
        <div class="div_2">
          分区：
          <select>
            <option value="1">1</option>
            <option value="2">2</option>
          </select>
        </div>
        <input type="submit" value="上传" class="btn">

      </form>
    </div>
</template>

<script>
export default {
  name: "Upload"
}
</script>

<style scoped lang="css">
.form_file {
  width: 311px;
  height: 200px;
  margin: 99px auto;
  border: 5px solid white;
  border-radius: 20px;
  text-align: center;
}
.div_1 {
  margin: 80px auto 40px;
  font-size: 20px;
  font-weight: bold;
}
.div_1 input {
  height: 20px;
  border: none;
  border-bottom: 2px solid #e7bb5e;
  text-indent: 1em;
}
.div_2 {
  font-size: 20px;
  font-weight: bold;
  margin: 20px auto 40px;
}
.div_2 select {
  width: 85px;
  height: 20px;
}
.btn {
  width: 140px;
  height: 40px;
  border: none;
  border-radius: 40px;
  font-size: 22px;
  font-weight: bold;
  background-image: linear-gradient(to right, #5433ff, #20bdff, #a5fecb);

}

</style>