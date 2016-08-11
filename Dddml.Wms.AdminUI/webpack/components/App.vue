<template>
    <div>
        <div class="wrapper">

            <header class="main-header">
                <!-- Logo -->
                <a href="index2.html" class="logo">
                    <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>A</b>LT</span>
                    <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg" style="font-family: 微软雅黑"><b>及至极客</b></span>
                </a>
                <!-- Header Navbar: style can be found in header.less -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>

                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">
                            <!-- User Account: style can be found in dropdown.less -->
                            <li class="dropdown user user-menu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <img :src="userImg | default 'css/admin-lte/img/user2-160x160.jpg'"
                                         class="user-image" alt="User Image">
                                    <!--<img src="css/admin-lte/img/user2-160x160.jpg" class="user-image" alt="User Image">-->
                                    <span class="hidden-xs">张三</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <!-- User image -->
                                    <li class="user-header">
                                        <img :src="userImg | default 'css/admin-lte/img/user2-160x160.jpg'"
                                             class="img-circle"
                                             alt="User Image">

                                        <p>
                                            张三 - 技术部
                                            <small>注册于 2016-02-12</small>
                                        </p>
                                    </li>
                                    <li class="user-footer">
                                        <div class="pull-left">
                                            <a href="#" class="btn btn-default btn-flat">修改资料</a>
                                        </div>
                                        <div class="pull-right">
                                            <a href="#" class="btn btn-default btn-flat">退出登录</a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>
            </header>

            <!-- =============================================== -->

            <!-- Left side column. contains the sidebar -->
            <aside class="main-sidebar">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <!-- Sidebar user panel -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img :src="userImg | default 'css/admin-lte/img/user2-160x160.jpg'" class="img-circle"
                                 alt="User Image">
                        </div>
                        <div class="pull-left info">
                            <p>张三</p>
                            <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                        </div>
                    </div>
                    <!-- /.search form -->
                    <!-- sidebar menu: : style can be found in sidebar.less -->
                    <ul id="main-menu" class="sidebar-menu">
                        <li class="header">聚合</li>
                        <li v-for="aggregate in aggregates">
                            <a v-link="{ name: 'aggregate', params: { name: aggregate.plural } }"
                               v-on:click="changeAggregate(aggregate)">
                                <i class="fa fa-th"></i> <span>{{aggregate.collectionLabel}}</span>
                            </a>
                        </li>
                    </ul>
                </section>        <!-- /.sidebar -->
            </aside>

            <!-- =============================================== -->

            <router-view :aggregate="currentAggregate"></router-view>

            <footer class="main-footer">
                <div class="pull-right hidden-xs">
                    <b>Version</b> 0.0.1
                </div>
                <strong>Copyright &copy; 2016 <a href="http://jizhijike.com">及至极客</a>.</strong> All rights
                reserved.
            </footer>
        </div>
    </div>
</template>
<style>
</style>
<script>
    import aggregates from './../aggregates';
    export default{
        data(){
            return {
                aggregates: aggregates,
                currentAggregate: {}
            }
        },
        props: {
            userImg: String
        },
        methods: {
            changeAggregate: function (aggregate) {
                this.currentAggregate = aggregate;
//                console.log(this.currentAggregate);
            }
        },
        ready(){
            for (let i = 0; i < this.aggregates.length; i++) {
                if (this.aggregates[i].plural == this.$route.params.name) {
                    this.currentAggregate = this.aggregates[i];
                    break;
                }
            }
        }
    }
</script>
