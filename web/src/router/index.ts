import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import About from '../views/About.vue'
import Info from '../views/header/info.vue'
import Download from '../views/header/download.vue'
import ScoreSearch from '../views/header/score-search.vue'
import Comment from '../views/header/comment.vue'
import OnlineTest from '../views/header/online-test.vue'
import AboutUs from '../views/header/about-us.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    component: About
  },
  {
    path: '/info',
    name: 'Info',
    component: Info
  },
  {
    path: '/download',
    name: 'Download',
    component: Download
  },
  {
    path: '/score-search',
    name: 'ScoreSearch',
    component: ScoreSearch
  },
  {
    path: '/comment',
    name: 'Comment',
    component: Comment
  },
  {
    path: '/online-test',
    name: 'OnlineTest',
    component: OnlineTest
  },
  {
    path: '/about-us',
    name: 'AboutUs',
    component: AboutUs
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
