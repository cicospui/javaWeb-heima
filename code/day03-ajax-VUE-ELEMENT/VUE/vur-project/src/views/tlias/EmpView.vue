<template>
    <div>
        <el-container style="height: 500px; border: 1px solid #eee">
            <el-header style="font-size: 40px;background-color: rgb(238,241,246)">tlias智能学习辅助系统</el-header>
            <el-container>
                <el-aside width="200px">
                    <el-menu :default-openeds="['1', '3']">
                        <el-submenu index="1">
                            <template slot="title"><i class="el-icon-message"></i>信息管理系统</template>
                            
                            <el-menu-item index="1-1">部门管理</el-menu-item>
                            <el-menu-item index="1-2">员工管理</el-menu-item>
                                                   
                        </el-submenu>
                    </el-menu>
                </el-aside>
                <el-main>
                    <el-table :data="tableData">
                        <el-table-column prop="date" label="日期" width="140">
                        </el-table-column>
                        <el-table-column prop="name" label="姓名" width="120">
                        </el-table-column>
                        <el-table-column prop="address" label="地址">
                        </el-table-column>
                    </el-table>
                </el-main>
            </el-container>
        </el-container>
    </div>
</template>

<script>
export default{


}

</script>

<style>


</style>


