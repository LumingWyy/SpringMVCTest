//window.alert("Hello world (js)");


function updateData() {
    $.get("/mvc/data", function (data) {
        window.alert('data：'+JSON.stringify(data))
        $("#username").text(data.username)
        $("#age").text(data.age)
    })
}

function sendData() {
    // $.post("/mvc/submit", {
    //     username: "test",
    //     age: 18
    // }, function (data) {
    //     window.alert('data：'+JSON.stringify(data))
    // })
    $.ajax({
        type: 'POST',
        url: "/mvc/submit",
        data: JSON.stringify({username: "测试", age: 18}),
        success: function (data) {
            window.alert(JSON.stringify(data))
        },
        contentType: "application/json"
    })
}