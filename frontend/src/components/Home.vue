<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
     <table class="w3-table w3-bordered w3-striped w3-border test w3-hoverable">
      <tbody>
        <tr class="w3-green">
            <th>계절</th>
            <th>과일</th>
      </tr>
      </tbody>
      <tbody>
      <tr>
        <td>봄</td>
        <td>딸기</td>
      </tr>
      <tr>
        <td>여름</td>
        <td>수박</td>
      </tr>
      <tr>
        <td>가을</td>
        <td>포도</td>
      </tr>
      <tr>
        <td>겨울</td>
        <td>귤</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
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
