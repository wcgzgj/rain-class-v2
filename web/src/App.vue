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

</style>
