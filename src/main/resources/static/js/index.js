$(document).ready(function(){

    getAuthorList('');
    getAffiliationList('');
    getJournal('');
    getConference('');

    getAuthorRank();
    getMeetingRank();


    function getAffiliationList(keyword){
        getRequest(
            '/article/terms',
            function (res) {
                renderAffiliationList(res.content);
            },
            function (error) {
                alert(error);
            });
    }
    function getJournal(keyword){
        getRequest(
            '/article/top',
            function (res) {
                renderJournal(res.content);
            },
            function (error) {
                alert(error);
            });
    }
    function getConference(keyword){
        getRequest(
            '/conference/count',
            function (res) {
                renderConference(res.content);
            },
            function (error) {
                alert(error);
            });
    }
    function getAuthorList(keyword) {
        getRequest(
            '/author/top',
            function (res) {
                renderAuthorList(res.content);
            },
            function (error) {
                alert(error);
            });
    }

    function renderAuthorList(list) {
        $('.author-on-list').empty();
        var movieDomStr = '';
        list.forEach(function (author) {
            movieDomStr +=
                "<li class='author-item card'>" +
                "<div class='author-name'><a class='a' href='/user/authorDetail?name="+ author.name +"'>"+author.name+"</a></div>"+
                "<div class='author-num'>"+
                "<div class='progress'>" +
                "  <div class='progress-bar progress-bar-info' role='progressbar'" +
                " aria-valuenow='"+(author.articles)+"' aria-valuemin='0' aria-valuemax=\"100\" style=\"width: "+(author.articles)+"%\">" +
                "    <span class=\"sr-only\">"+author.articles+"</span>" +
                "  </div>"+"</div>"+
                "</li>";
        });
        $('.author-on-list').append(movieDomStr);
    }
    function renderAffiliationList(list){
        $('.aff-on-list').empty();
        var movieDomStr = '';
        list.forEach(function (author) {
            movieDomStr +=
                "<li class='aff-item card'>" +
                "<div class='aff-name'><a class='a' href='/user/affDetail?name="+ author.word +"'>"+author.word+"</a></div>"+
                "<div class='aff-num'>"+ "<div class='progress'>" +
                "  <div class='progress-bar progress-bar-info' role='progressbar'" +
                " aria-valuenow='"+(author.count/50)+"' aria-valuemin='0' aria-valuemax=\"100\" style=\"width: "+(author.count/50)+"%\">" +
                "    <span class=\"sr-only\">"+author.count/50+"</span>" +
                "</li>";
        });
        $('.aff-on-list').append(movieDomStr);
    }
    function renderJournal(list){
        $('.journal-on-list').empty();
        var movieDomStr = '';
        list.forEach(function (author) {
            movieDomStr +=
                "<li class='journal-item card'>" +
                "<div class='journal-name'><a class='a' href='/user/journalDetail?name="+ author.title +"'>"+author.title+"</a></div>"+
                "<div class='journal-num'>"+"<div class='progress'>" +
                "  <div class='progress-bar progress-bar-info' role='progressbar'" +
                " aria-valuenow='"+(author.citations)+"' aria-valuemin='0' aria-valuemax=\"100\" style=\"width: "+(author.citations)+"%\">" +
                "    <span class=\"sr-only\">"+author.citations+"</span>" +
                "</li>";
        });
        $('.journal-on-list').append(movieDomStr);
    }
    function renderConference(list){
        $('.conference-on-list').empty();
        var movieDomStr = '';
        list.forEach(function (author) {
            movieDomStr +=
                "<li class='conference-item card'>" +
                "<div class='conference-name'><a class='a' href='/user/conferenceDetail?name="+ author.conference +"'>"+author.conference+"</a></div>"+
                "<div class='conference-num'>"+"<div class='progress'>" +
                "  <div class='progress-bar progress-bar-info' role='progressbar'" +
                " aria-valuenow='"+(author.count/50)+"' aria-valuemin='0' aria-valuemax=\"100\" style=\"width: "+(author.count/50)+"%\">" +
                "    <span class=\"sr-only\">"+author.count/50+"</span>" +
                "</li>";
        });
        $('.conference-on-list').append(movieDomStr);
    }


    /**/


    function getAuthorRank() {
        getRequest(
            '/article/hotword',
            function (res) {
                var data = res.content || [];
                console.log(data);
                var nameList = data.map(function (item) {
                    return item.word;
                });
                var tableData = data.map(function (item) {
                    return item.count;
                });
                var option={
                    title : {
                        text: '热词',
                        x:'center'
                    },
                    grid:{
                        top:'10%'
                    },
                    xAxis: {
                        type: 'category',
                        data: nameList,
                        axisLabel:{
                            interval:0,//横轴信息全部显示
                            rotate:-15,//-30度角倾斜显示
                        }
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: tableData,
                        type: 'bar',
                        itemStyle: {
                            normal: {
                                //这里是重点
                                color: function(params) {
                                    //注意，如果颜色太少的话，后面颜色不会自动循环，最好多定义几个颜色
                                    var colorList = ['#c23531','#2f4554', '#61a0a8', '#d48265', '#91c7ae','#749f83', '#ca8622'];
                                    return colorList[params.dataIndex]
                                }
                            }
                        }
                    }]
                };
                var authorRankChart = echarts.init($("#author-rank-container")[0]);
                authorRankChart.setOption(option);
            },
            function (error) {
                alert(JSON.stringify(error));
            }
        )
    }

    function getMeetingRank() {
        getRequest(
            '/article/yearly',
            function (res) {
                var data = res.content || [];
                var yearList = data.map(function (item) {
                    return item.year;
                });
                var tableData = data.map(function (item) {
                    return item.count;
                });
                var option={
                    title : {
                        text: '每年发表论文数量趋势',
                        x:'center'
                    },
                    xAxis: {
                        type: 'category',
                        data: yearList
                    },
                    yAxis: {
                        type: 'value'
                    },
                    series: [{
                        data: tableData,
                        type: 'line'
                    }]
                };
                var meetingRankChart = echarts.init($("#meeting-rank-container")[0]);
                meetingRankChart.setOption(option);
            },
            function (error) {
                alert(JSON.stringify(error));
            }
        )
    }




});
