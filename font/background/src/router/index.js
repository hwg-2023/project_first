import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'login',
    redirect: '/login_1',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/login'),
    children: [
      {
        path: 'Register',
        name: 'Register',
        component: () => import('../Page/Register')
      },
      {
        path: 'login_1',
        name: 'login_1',
        component: () => import('../Page/Login_1')
      }
    ]
  },
  {
    path: '/mainBackground',
    name: 'mainBackground',
    redirect: '/mainBackground/upload',
    component: () => import('../views/mainBackground'),
    children: [
      {
        path: 'upload',
        name: 'Upload',
        component: () => import('../Page/Upload')
      }
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
