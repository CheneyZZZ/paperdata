$(document).ready(function () {
    // getAdvancedDocumentsList();
    var searchForm=[];

    console.log("ready");

    $("#search-button-advanced").click(function () {

        console.log("OK");
        var documentForm={
            year:$("#input-year").val(),
            conference:$("#input-conference").val(),
            keys:$("#input-keywords").val()
        };
        console.log(documentForm.keys);
        searchForm.push(documentForm.year);
        searchForm.push(documentForm.conference);
        searchForm.push(documentForm.keys);
        console.log(searchForm);
        console.log(documentForm.keys);

        postRequest(
            '/article/search',
            documentForm,
            function (res) {
                if(res.success){
                    var list=res.content;
                    console.log("================");
                    console.log(list);
                    console.log("================");
                    renderDocumentList(list);
                } else {
                    alert(res.message);
                }
            },
            function (error) {
                alert(JSON.stringify(error));
            }
        );
    })


    function renderDocumentList(list) {
        console.log("!!!!!1");
        $(".item-1").empty();
        $(".item-1").append("<span class='title gray-text'>搜索结果</span>");

        var documentDomStr="";

        console.log("??????");
        list.forEach(function(document){
            documentDomStr+=
                "<div class='wrapper'>" +
                "                <div class='product-info'>" +
                "                    <div class='product-text'>" +
                "                        <div>" +
                "                            <h3>文献名:" +
                "                                <span>"+document.title+"</span>" +
                "                            </h3>" +
                "                        </div>"+
                "                        <div>" +
                "                            <h3>年份:" +
                "                                <span>"+document.year+"</span>" +
                "                            </h3>" +
                "                        </div>" +
                "                        <div>" +
                "                            <h3>会议名称:" +
                "                                <span>"+document.conference+"</span>" +
                "                            </h3>" +
                "                        </div>" +
                "                    </div>" +
                "                </div>" +
                "            </div>";


        });

        console.log(documentDomStr);

        $(".item-1").append(documentDomStr);
    }




});
