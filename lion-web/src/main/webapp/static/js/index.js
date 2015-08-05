/**
 * Created by solis on 2015/8/4.
 */
$(function(){
    $('#easy-table').datagrid({
        title:'我的表格',
        pagination:true,
        pageNumber:4,
        pagePosition:'top',
        striped: true,
        showFooter:true,
        rownumbers:true,//行号
        url:'/user/users.json',
        columns:[[
            {field:'id',title:'ID',width:100},
            {field:'username',title:'UserName',width:100},
            {field:'birthday',title:'Birthday',width:100,align:'right'},
            {field:'sex',title:'Sex',width:100,align:'right'},
            {field:'address',title:'Address',width:100,align:'right'}
        ]]
    });

    $('#btn').linkbutton({
        text:'增加用户',
        iconCls:'icon-add',
        plain:true

    });

    function UserVO(){
        this.username='';
    };





    $('#btn').click(function(){
        var obj = new UserVO();
        UserVO.prototype.id;
        UserVO.prototype.idcard;
        obj.id=10;
        obj.idcard='12820019199999999'
        obj.username='zhangsan';
        $.ajax({
            type:'POST',
            url: "/user/adduser.json",
            data: JSON.stringify(obj),
            contentType: 'application/json',
            success: function(data){
                alert(data);
            }
        });


    });

});
