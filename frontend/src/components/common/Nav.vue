<template>
   <div>
   <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">비트캠프</a>
      
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><router-link to="/">Home</router-link></li>
      <li><router-link to="/calculator">계산기</router-link></li>
      <li><router-link to="/member-list">회원목록</router-link></li>
      <li><router-link to="/join-form">회워가입</router-link></li>
      <li><router-link to="/login-form">로그인</router-link></li>
    </ul>
  </div>
</nav>
   </div> 
</template>
<script>
export default {
    
}
</script>
<style scoped>

</style>