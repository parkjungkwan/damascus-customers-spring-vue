<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button class="btn btn-default" @click="get">조 회</button>
    <button class="btn btn-default" @click="post">입 력</button>
    <button class="btn btn-default" @click="put">수 정</button>
    <button class="btn btn-default" @click="del">삭 제</button>
    
    
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import axios from 'axios'

export default {
  components: {
    Nav,
    Footer
  },
  methods:{
      get: ()=>{
         axios.get('/customers/hong')
         .then(d=>{
           
             alert(`SUCCESS : ${d.data.customerId}`)
         })
         .catch(e=>{
             alert('ERROR')
         })
      },
      post: ()=>{
        axios.post('/customers')
        .then(d=>{
          alert(`POST 연동성공: ${d.result}`)
        })
      },
      put: ()=>{
        axios.put('/customers/id')
        .then(d=>{
          alert(`PUT 연동성공: ${d.result}`)
        })
      },
      del: ()=>{
        axios.delete('/customers/id')
        .then(d=>{
          alert(`DEL 연동성공: ${d.result}`)
        })
      }


  }
}
</script>

<style scoped>
</style>