$(document).ready(function(){

    getAuthorList('');
    // getAffiliationList('');
    // getJournal('');
    // getConference('');

    // function getAffiliationList(keyword){
    //     getRequest(
    //         '/view/aff',
    //         function (res) {
    //             renderAffiliationList(res.content);
    //         },
    //         function (error) {
    //             alert(error);
    //         });
    // }
    // function getJournal(keyword){
    //     getRequest(
    //         '/view/journal',
    //         function (res) {
    //             renderJournal(res.content);
    //         },
    //         function (error) {
    //             alert(error);
    //         });
    // }
    // function getConference(keyword){
    //     getRequest(
    //         '/view/Conference'+keyword,
    //         function (res) {
    //             renderConference(res.content);
    //         },
    //         function (error) {
    //             alert(error);
    //         });
    // }
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
            author.description = author.description || '';
            movieDomStr +=
                "<li class='author-item card'>" +
                "<div class='author-name'><a class='a' href='/user/authorDetail?name="+ author.name +"'>"+author.name+"</a></div>"+
                // "<div class='author-num'>"+
                // "<div class='progress'>" +
                // "  <div class='progress-bar progress-bar-info' role='progressbar'" +
                // " aria-valuenow='"+(author.num)+"' aria-valuemin='0' aria-valuemax=\"100\" style=\"width: "+(author.num)+"%\">" +
                // "    <span class=\"sr-only\">"+author.num+"</span>" +
                // "  </div>"+"</div>"+
                "</li>";
        });
        $('.author-on-list').append(movieDomStr);
    }
    function renderAffiliationList(list){
        $('.aff-on-list').empty();
        var movieDomStr = '';
        list.forEach(function (author) {
            author.description = author.description || '';
            movieDomStr +=
                "<li class='aff-item card'>" +
                "<div class='aff-name'><a class='a' href='/user/affDetail?name="+ author.name +"'>"+author.name+"</a></div>"+
                "<div class='aff-num'>"+"<div class='progress'>" +
                "  <div class='progress-bar progress-bar-info' role='progressbar'" +
                " aria-valuenow='"+(author.num)+"' aria-valuemin='0' aria-valuemax=\"100\" style=\"width: "+(author.num)+"%\">" +
                "    <span class=\"sr-only\">"+author.num+"</span>" +
                "</li>";
        });
        $('.aff-on-list').append(movieDomStr);
    }
    function renderJournal(list){
        $('.journal-on-list').empty();
        var movieDomStr = '';
        list.forEach(function (author) {
            author.description = author.description || '';
            movieDomStr +=
                "<li class='journal-item card'>" +
                "<div class='journal-name'><a class='a' href='/user/journalDetail?name="+ author.name +"'>"+author.name+"</a></div>"+
                "<div class='journal-num'>"+"<div class='progress'>" +
                "  <div class='progress-bar progress-bar-info' role='progressbar'" +
                " aria-valuenow='"+(author.num/4)+"' aria-valuemin='0' aria-valuemax=\"100\" style=\"width: "+(author.num/4)+"%\">" +
                "    <span class=\"sr-only\">"+author.num+"</span>" +
                "</li>";
        });
        $('.journal-on-list').append(movieDomStr);
    }
    function renderConference(list){
        $('.conference-on-list').empty();
        var movieDomStr = '';
        list.forEach(function (author) {
            author.description = author.description || '';
            movieDomStr +=
                "<li class='conference-item card'>" +
                "<div class='conference-name'><a class='a' href='/user/conferenceDetail?name="+ author.name +"'>"+author.name+"</a></div>"+
                "<div class='conference-num'>"+"<div class='progress'>" +
                "  <div class='progress-bar progress-bar-info' role='progressbar'" +
                " aria-valuenow='"+(author.num)+"' aria-valuemin='0' aria-valuemax=\"100\" style=\"width: "+(author.num)+"%\">" +
                "    <span class=\"sr-only\">"+author.num+"</span>" +
                "</li>";
        });
        $('.conference-on-list').append(movieDomStr);
    }
});
