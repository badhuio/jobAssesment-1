$("document").ready(function (){

    $("#getData").click(function getData(){

        $.ajax({
            url: "/getData",
            type: "Get",
            success: function(data){

                $("#department").empty();
                $("#designation").empty();
                $("#joiningDate").empty();

                $.each(data, function(index,item){
                    $("#department").append(
                        '<option value="' + item.id + '">' + item.department_name + '</option>'
                    )
                    $("#designation").append(
                        '<option>' + item.designation + '</option>'
                    )
                    $("#joiningDate").append(
                        '<option>' + item.join_date + '</option>'
                    )
                })
            }
        })

        $.ajax({
            url: "/getProject",
            type: "Get",
            success: function(data){

                $.each(data,function(index,item){

                    $("#project").append(
                        '<option value="' + item.id + '">' + item.project_name + '</option>'
                    )

                })

            }
        })

    })

    $("#save").click(function saveData(){

    let data = {
        name : $("#name").val(),
        location : $("#location").val(),
         employeeId: $("#department").val(),
            projectId: $("#project").val()
    }

    $.ajax({
        url: "/saveData",
        type: "Post",
        contentType: "application/json",
        data: JSON.stringify(data),
                success: function(){
                    $("input").val('');
                    $("select").val('');

                    alert("Data Saving Success");
                },
                error: function(xhr){
                    alert(xhr.status+ '-' + xhr.statusText);
                }
    })
    })
})