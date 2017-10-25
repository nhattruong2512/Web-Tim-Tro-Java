/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function uploadImage(that) {
    var fr = new FormData();
    fr.append(that.files[0].name, that.files    [0])
    $.ajax({
        type:'POST',
        url:'UploadServlet',
        data: fr,
        success: function (data) {
            console.log(data)
        }
    })
}