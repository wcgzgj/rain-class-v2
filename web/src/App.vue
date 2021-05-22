<template>
  <the-header></the-header>
  <router-view/>
  <the-footer></the-footer>
</template>


<script lang="ts">
  import { defineComponent} from 'vue';
  import TheFooter from './components/the-footer.vue'
  import TheHeader from "./components/the-header.vue";

  export default defineComponent({
    name: 'Home',
    components: {
      TheHeader,
      TheFooter
    },
  });
</script>


<style lang="scss">
/*#app {*/
/*  font-family: Avenir, Helvetica, Arial, sans-serif;*/
/*  -webkit-font-smoothing: antialiased;*/
/*  -moz-osx-font-smoothing: grayscale;*/
/*  text-align: center;*/
/*  color: #2c3e50;*/
/*}*/

/*#nav {*/
/*  padding: 30px;*/

/*  a {*/
/*    font-weight: bold;*/
/*    color: #2c3e50;*/

/*    &.router-link-exact-active {*/
/*      color: #42b983;*/
/*    }*/
/*  }*/
/*}*/
</style>
