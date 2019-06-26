import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Calculator from '@/components/basic/Calculator'
import JoinForm from '@/components/member/JoinForm'
import LoginForm from '@/components/member/LoginForm'
import MemberList from '@/components/member/MemberList'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {path: '/',name: 'home',component: Home},
    {path: '/calculator',name: 'calculator',component: Calculator},
    {path: '/join-form', name: 'join-form', component: JoinForm},
    {path: '/login-form', name: 'login-form', component: LoginForm},
    {path: '/member-list', name: 'member-list', component: MemberList},
  ]
})

