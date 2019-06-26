<template>
  <div class="hello">
    <Nav></Nav>
    <JumboTron></JumboTron>
    <Footer></Footer>
  </div>
</template>
<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import JumboTron from'@/components/common/JumboTron.vue'
export default {
  name: 'home',
  components:{
    Nav,Footer,JumboTron
  },
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;

  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>