<template>
  <a-layout style="min-height: 100vh">
    <a-layout-sider v-model:collapsed="collapsed" collapsible>
      <div class="logo" />
      <a-menu theme="dark" v-model:selectedKeys="selectedKeys" mode="inline">
        <a-sub-menu key="sub1">
          <template #title>
            <span>
              <user-outlined />
              <span>学生操作</span>
            </span>
          </template>
          <router-link to="/select-class">
            <a-menu-item key="1">学生选课</a-menu-item>
          </router-link>
          <router-link to="/class-result">
            <a-menu-item key="2">选课结果查询</a-menu-item>
          </router-link>
        </a-sub-menu>
        <a-sub-menu key="sub2">
          <template #title>
            <span>
              <team-outlined />
              <span>老师操作</span>
            </span>
          </template>
          <a-menu-item key="3">选课管理</a-menu-item>
          <a-menu-item key="4">成绩导入</a-menu-item>
          <a-menu-item key="5">成绩计算</a-menu-item>
          <a-menu-item key="6">成绩分析</a-menu-item>
          <a-menu-item key="7">成绩预警</a-menu-item>
          <a-menu-item key="8">成绩通知</a-menu-item>
        </a-sub-menu>
      </a-menu>
    </a-layout-sider>
    <a-layout>


      <a-layout-content style="margin: 0 16px">
        <a-breadcrumb style="margin: 16px 0">

        </a-breadcrumb>
        <div :style="{ padding: '24px', background: '#fff', minHeight: '360px' }">

          <router-view />

        </div>
      </a-layout-content>


      <a-layout-footer style="text-align: center">
        雨选课 ©2021 Created by FARO_Z
      </a-layout-footer>
    </a-layout>
  </a-layout>
</template>

<script lang="ts">
  import {
    PieChartOutlined,
    DesktopOutlined,
    UserOutlined,
    TeamOutlined,
    FileOutlined,
    StarOutlined,
    LikeOutlined,
    MessageOutlined
  } from '@ant-design/icons-vue';
import { defineComponent ,ref} from 'vue';


const listData: Record<string, string>[] = [];

  for (let i = 0; i < 100; i++) {
    listData.push({
      href: 'https://www.antdv.com/',
      title: `数据结构 ${i}`,
      avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
      description:
              '课程介绍',
      content:
              '数据结构（英语：data structure）是计算机中存储、组织数据的方式。数据结构是一种具有一定逻辑关系，在计算机中应用某种存储结构，并且封装了相应操作的数据元素集合。它包含三方面的内容，逻辑关系、存储关系及操作。',

    });
  }

export default defineComponent({
  name: 'Home',
  components: {
    PieChartOutlined,
    DesktopOutlined,
    UserOutlined,
    TeamOutlined,
    FileOutlined,
    StarOutlined,
    LikeOutlined,
    MessageOutlined
  },
  setup() {

    const pagination = {
      onChange: (page: number) => {
        console.log(page);
      },
      pageSize: 3,
    };
    const actions: Record<string, string>[] = [
      { type: 'StarOutlined', text: '156' },
      { type: 'LikeOutlined', text: '156' },
      { type: 'MessageOutlined', text: '2' },
    ];

    return {
      collapsed: ref<boolean>(false),
      selectedKeys: ref<string[]>(['1']),
      listData,

      pagination,
      actions
    };
  },
});
</script>

<style>
  #components-layout-demo-side .logo {
    height: 32px;
    margin: 16px;
    background: rgba(255, 255, 255, 0.3);
  }

  .site-layout .site-layout-background {
    background: #fff;
  }
  [data-theme='dark'] .site-layout .site-layout-background {
    background: #141414;
  }
</style>