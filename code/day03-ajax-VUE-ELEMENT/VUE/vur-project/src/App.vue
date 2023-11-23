<template>
  <div id="app">
    <!-- <h1>{{ message }}</h1> -->
    <!-- <element-view></element-View> -->
    <emp-view>

    </emp-view>
  </div>
</template>

<script>
// import ElementView from './views/Element/ElementView.vue'
import EmpView from './views/tlias/EmpView.vue'
export default{
  // components:{ ElementView },
  components:{EmpView},

  data(){
    return {
      message: "hello Vue"
    }
  },
  methods: {
    
  }
}
</script>

<style>
</style>
