import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Calculator from '@/components/basic/Calculator'
import JoinForm from '@/components/member/JoinForm'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {path: '/',name: 'home',component: Home},
    {path: '/calculator',name: 'calculator',component: Calculator},
    {path: '/joinform', name: 'joinform', component: JoinForm}
  ]
})
