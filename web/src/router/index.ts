import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import HomeView from '../views/home-view.vue'
import About from '../views/About.vue'
import Info from '../views/header/info.vue'
import Download from '../views/header/download.vue'
import ScoreSearch from '../views/header/score-search.vue'
import Comment from '../views/header/comment.vue'
import OnlineTest from '../views/header/online-test.vue'
import AboutUs from '../views/header/about-us.vue'
import DownloadPage from '../views/all/download-page.vue'

import SelectClass from '../views/student/select-class.vue'
import ClassResult from '../views/student/class-result.vue'


import ClassManage from '../views/teacher/class-manage.vue'
import ChangeClassInfo from '../views/teacher/change-class-info.vue'

import ScoreCount from '../views/teacher/score-count.vue'
import ScoreAnalyse from '../views/teacher/score-analyse.vue'
import ScoreAlert from '../views/teacher/score-alert.vue'
import ScoreInfo from '../views/teacher/score-info.vue'


import ClassInfo from '../views/class/class-info.vue'
import MyClassInfo from '../views/student/my-class-info.vue'





const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    component: Home,
    redirect: '/home-view',
    children: [
      {
        path: 'home-view',
        name: 'HomeView',
        component: HomeView
      },
      {
        path: 'select-class',
        name: 'SelectClass',
        component: SelectClass
      },
      {
        path: 'class-result',
        name: 'ClassResult',
        component: ClassResult
      },
      {
        path: 'class-manage',
        name: 'ClassManage',
        component: ClassManage
      },
      {
        path: 'change-class-info',
        name: 'ChangeClassInfo',
        component: ChangeClassInfo
      },
      {
        path: 'score-count',
        name: 'ScoreCount',
        component: ScoreCount
      },
      {
        path: 'score-analyse',
        name: 'ScoreAnalyse',
        component: ScoreAnalyse
      },
      {
        path: 'score-alert',
        name: 'ScoreAlert',
        component: ScoreAlert
      },
      {
        path: 'score-info',
        name: 'ScoreInfo',
        component: ScoreInfo
      },
      {
        path: 'class-info',
        name: 'ClassInfo',
        component: ClassInfo
      },
      {
        path: 'my-class-info',
        name: 'MyClassInfo',
        component: MyClassInfo
      },
    ]
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
  },
  {
    path: '/download-page',
    name: 'DownloadPage',
    component: DownloadPage
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
