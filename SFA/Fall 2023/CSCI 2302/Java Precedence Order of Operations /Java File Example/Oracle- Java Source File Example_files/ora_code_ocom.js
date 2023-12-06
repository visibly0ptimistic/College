/*!
######################################################
# ORA_CODE_OCOM.JS - v3.96
# BUILD DATE: 23rd-March-2022
# COPYRIGHT ORACLE CORP 2022 [UNLESS STATED OTHERWISE]
######################################################
*/
/*! Report suite set up */
function s_setAccount(){var sa=["oracledevall","ocom",s_setOraLangCountryGLOBAL("oracle.com")];if(location.href.indexOf("www.oracle.com/mn/")!=-1){sa[1]="global";sa[2]="en-mn";}if(location.href.indexOf("www.oracle.com/lv/")!=-1){sa[1]="global";sa[2]="en-lv";}if(location.href.indexOf("www.oracle.com/lt/")!=-1){sa[1]="global";sa[2]="en-lt";}if(location.href.indexOf("www.oracle.com/ua/")!=-1){sa[1]="global";sa[2]="en-ua";}if(location.href.indexOf("www.oracle.com/ng/")!=-1){sa[1]="global";sa[2]="en-ng";}if(location.href.indexOf("www.oracle.com/dz/")!=-1){sa[1]="global";sa[2]="en-dz";}if(location.href.indexOf("www.oracle.com/gh/")!=-1){sa[1]="global";sa[2]="en-gh";}if(location.href.indexOf("www.oracle.com/ke/")!=-1){sa[1]="global";sa[2]="en-ke";}if(location.href.indexOf("www.oracle.com/ma/")!=-1){sa[1]="global";sa[2]="en-ma";}if(location.href.indexOf("www.oracle.com/sn/")!=-1){sa[1]="global";sa[2]="en-sn";}if(location.href.indexOf("www.oracle.com/bh/")!=-1){sa[1]="global";sa[2]="en-bh";}if(location.href.indexOf("www.oracle.com/eg/")!=-1){sa[1]="global";sa[2]="en-eg";}if(location.href.indexOf("www.oracle.com/iq/")!=-1){sa[1]="global";sa[2]="en-iq";}if(location.href.indexOf("www.oracle.com/jo/")!=-1){sa[1]="global";sa[2]="en-jo";}if(location.href.indexOf("www.oracle.com/kw/")!=-1){sa[1]="global";sa[2]="en-kw";}if(location.href.indexOf("www.oracle.com/lb/")!=-1){sa[1]="global";sa[2]="en-lb";}if(location.href.indexOf("www.oracle.com/om/")!=-1){sa[1]="global";sa[2]="en-om";}if(location.href.indexOf("www.oracle.com/qa/")!=-1){sa[1]="global";sa[2]="en-qa";}if(location.href.indexOf("www.oracle.com/sa/")!=-1){sa[1]="global";sa[2]="en-sa";}if(location.href.indexOf("www.oracle.com/ye/")!=-1){sa[1]="global";sa[2]="en-ye";}if(location.href.indexOf("www.oracle.com/bt/")!=-1){sa[1]="global";sa[2]="en-bt";}if(location.href.indexOf("www.oracle.com/bn/")!=-1){sa[1]="global";sa[2]="en-bn";}if(location.href.indexOf("www.oracle.com/la/")!=-1){sa[1]="global";sa[2]="en-la";}if(location.href.indexOf("www.oracle.com/mv/")!=-1){sa[1]="global";sa[2]="en-mv";}if(location.href.indexOf("www.oracle.com/np/")!=-1){sa[1]="global";sa[2]="en-np";}if(location.href.indexOf("www.oracle.com/rs/")!=-1){sa[1]="global";sa[2]="en-rs";}if(location.href.indexOf("www.oracle.com/lu/")!=-1){sa[1]="global";sa[2]="en-lu";}if(location.href.indexOf("/cis/")!=-1){sa[1]="global";if(document.getElementsByName("Language")[0]!=undefined){sa[2]=document.getElementsByName("Language")[0].getAttribute("content")+"-cis";}if(document.getElementsByName("language")[0]!=undefined){sa[2]=document.getElementsByName("language")[0].getAttribute("content")+"-cis";}}if(location.href.indexOf("www.oracle.com/ae/")!=-1){sa[1]="global";sa[2]="en-ae";}if(location.href.indexOf("www.oracle.com/africa/")!=-1){sa[1]="global";sa[2]="en-africa";}if(location.href.indexOf("www.oracle.com/apac/")!=-1){sa[1]="global";sa[2]="en-apac";}if(location.href.indexOf("www.oracle.com/asiasouth/")!=-1){sa[1]="global";sa[2]="en-asiasouth";}if(location.href.indexOf("www.oracle.com/bd/")!=-1){sa[1]="global";sa[2]="en-bd";}if(location.href.indexOf("www.oracle.com/be-fr/")!=-1){sa[1]="global";sa[2]="fr-be";}if(location.href.indexOf("www.oracle.com/be-nl/")!=-1){sa[1]="global";sa[2]="nl-be";}if(location.href.indexOf("www.oracle.com/emea/")!=-1){sa[1]="global";sa[2]="en-emea";}if(location.href.indexOf("www.oracle.com/id/")!=-1){sa[1]="global";sa[2]="en-id";}if(location.href.indexOf("www.oracle.com/ke/")!=-1){sa[1]="global";sa[2]="en-ke";}if(location.href.indexOf("www.oracle.com/kh/")!=-1){sa[1]="global";sa[2]="en-kh";}if(location.href.indexOf("www.oracle.com/lk/")!=-1){sa[1]="global";sa[2]="en-lk";}if(location.href.indexOf("www.oracle.com/my/")!=-1){sa[1]="global";sa[2]="en-my";}if(location.href.indexOf("www.oracle.com/middleeast-ar/")!=-1){sa[1]="global";sa[2]="ar-middleeast";}if(location.href.indexOf("www.oracle.com/ph/")!=-1){sa[1]="global";sa[2]="en-ph";}if(location.href.indexOf("www.oracle.com/pk/")!=-1){sa[1]="global";sa[2]="en-pk";}if(location.href.indexOf("www.oracle.com/sg/")!=-1){sa[1]="global";sa[2]="en-sg";}if(location.href.indexOf("www.oracle.com/th/")!=-1){sa[1]="global";sa[2]="en-th";}if(location.href.indexOf("www.oracle.com/vn/")!=-1){sa[1]="global";sa[2]="en-vn";}if(location.href.indexOf("www.oracle.com/il-en/")!=-1){sa[1]="global";sa[2]="en-li";}if(location.href.indexOf("www.oracle.com/ar/")!=-1){sa[1]="global";sa[2]="esa-ar";}if(location.href.indexOf("www.oracle.com/bz/")!=-1){sa[1]="global";sa[2]="esa-bz";}if(location.href.indexOf("www.oracle.com/bo/")!=-1){sa[1]="global";sa[2]="esa-bo";}if(location.href.indexOf("www.oracle.com/cl/")!=-1){sa[1]="global";sa[2]="esa-cl";}if(location.href.indexOf("www.oracle.com/co/")!=-1){sa[1]="global";sa[2]="esa-co";}if(location.href.indexOf("www.oracle.com/cr/")!=-1){sa[1]="global";sa[2]="esa-cr";}if(location.href.indexOf("www.oracle.com/ec/")!=-1){sa[1]="global";sa[2]="esa-ec";}if(location.href.indexOf("www.oracle.com/gt/")!=-1){sa[1]="global";sa[2]="esa-gt";}if(location.href.indexOf("www.oracle.com/hn/")!=-1){sa[1]="global";sa[2]="esa-hn";}if(location.href.indexOf("www.oracle.com/mx/")!=-1){sa[1]="global";sa[2]="esa-mx";}if(location.href.indexOf("www.oracle.com/ni/")!=-1){sa[1]="global";sa[2]="esa-ni";}if(location.href.indexOf("www.oracle.com/pa/")!=-1){sa[1]="global";sa[2]="esa-pa";}if(location.href.indexOf("www.oracle.com/py/")!=-1){sa[1]="global";sa[2]="esa-py";}if(location.href.indexOf("www.oracle.com/pe/")!=-1){sa[1]="global";sa[2]="esa-pe";}if(location.href.indexOf("www.oracle.com/pr/")!=-1){sa[1]="global";sa[2]="esa-pr";}if(location.href.indexOf("www.oracle.com/uy/")!=-1){sa[1]="global";sa[2]="esa-uy";}if(location.href.indexOf("www.oracle.com/ve/")!=-1){sa[1]="global";sa[2]="esa-ve";}if(location.href.indexOf("www.oracle.com/bh-ar/")!=-1){sa[1]="global";sa[2]="ar-bh";}if(location.href.indexOf("www.oracle.com/eg-ar/")!=-1){sa[1]="global";sa[2]="ar-eg";}if(location.href.indexOf("www.oracle.com/iq-ar/")!=-1){sa[1]="global";sa[2]="ar-iq";}if(location.href.indexOf("www.oracle.com/jo-ar/")!=-1){sa[1]="global";sa[2]="ar-jo";}if(location.href.indexOf("www.oracle.com/kw-ar/")!=-1){sa[1]="global";sa[2]="ar-kw";}if(location.href.indexOf("www.oracle.com/lb-ar/")!=-1){sa[1]="global";sa[2]="ar-lb";}if(location.href.indexOf("www.oracle.com/om-ar/")!=-1){sa[1]="global";sa[2]="ar-om";}if(location.href.indexOf("www.oracle.com/qa-ar/")!=-1){sa[1]="global";sa[2]="ar-qa";}if(location.href.indexOf("www.oracle.com/sa-ar/")!=-1){sa[1]="global";sa[2]="ar-sa";}if(location.href.indexOf("www.oracle.com/ye-ar/")!=-1){sa[1]="global";sa[2]="ar-ye";}if(location.href.indexOf("www.oracle.com/ae-ar/")!=-1){sa[1]="global";sa[2]="ar-ae";}if(location.href.indexOf("www.oracle.com/africa-fr/")!=-1){sa[1]="global";sa[2]="fr-africa";}if(location.href.indexOf("www.oracle.com/middleeast/")!=-1){sa[1]="global";sa[2]="en-middleeast";}if(location.href.indexOf("www.oracle.com/md/")!=-1){sa[1]="global";sa[2]="en-md";}if(sa[2]!="en-us"||location.host.indexOf("oracle.co.jp")!=-1){sa[1]="global";}sa[1]=(location.host.indexOf("m.oracle.com")!=-1||location.host.indexOf("m-stage.oracle.com")!=-1)?"ocom:mobile":sa[1];sa[1]=(location.host.indexOf("developer.oracle.com")!=-1)?"developer":sa[1];sa[2]=(location.host.indexOf("oracle.co.jp")!=-1)?"ja-jp":sa[2];sa[1]=(location.host.indexOf("investor.oracle.com")!=-1)?"investor":sa[1];sa[1]=(location.host.indexOf("edelivery.oracle.com")!=-1)?"edelivery":sa[1];if(s_checkdev()){sa[0]=(sa[2]!="en-us")?"oracledevworldwide1,oracledevall":"devoraclecom,oracledevall";}else{sa[0]=(sa[2]!="en-us")?"oracleworldwide,oracleglobal":"oraclecom,oracleglobal";}return sa;}
/*! PrePlugins */
function s_prePlugins(s){s_oraVer(":ocom",":3.96");}
/*! PostPlugins plus site functions */
function s_postPlugins(s){if(typeof(s_meta)!="undefined"){if(s_meta.access=="gated"){s.events="event19";s.eVar27=s.pageName;}}if(s.pageName.indexOf("ocom:mobile")!=-1&&location.href.indexOf("m.oracle.com/partners")!=-1){s.pageName=s.pageName.replace("/","/partners/");}if(s.pageName.indexOf("ocom:mobile")!=-1&&location.href.indexOf("m.oracle.com/technetwork")!=-1){s.pageName=s.pageName.replace("/","/technetwork/");}if((window.location.pathname.indexOf("auto.oracle.com")!=-1)||(window.location.host=="auto.oracle.com")){s.pageName=s_setAccount()[1]+":"+s_setAccount()[2]+":/autonomous-database-offer"+location.pathname;if(window.location.pathname.indexOf("auto.oracle.com")!=-1){s.pageName=s.pageName.replace("auto.oracle.com/index.html","");s.pageName=s.pageName.replace("auto.oracle.com/index-qa.html","");}else{if(window.location.host=="auto.oracle.com"){s.pageName=s.pageName.replace("/index.html","");}}if(s.pageName.indexOf("edelivery")&&s.pageName.indexOf("jsessionid=")){s.pageName=s.pageName.split(";jsessionid=")[0];}s.channel=s.pageName;}s_setBluekaiData();if(s.linkDownloadFileTypes.indexOf("deb")==-1){s.linkDownloadFileTypes+=",deb";}if(window.dataLayerObject&&window.dataLayerObject.page){s.eVar92=window.dataLayerObject.page.variation;}}function s_checkdev(){var isDev=false;var devSites=new Array();devSites=["-stage","-dev","-content","localhost","127.0.0.1","-sites","webstandards-us"];var al=devSites.length;for(i=0;i<al;i++){if(location.host.indexOf(devSites[i])!=-1){isDev=true;i=al+1;}}return(isDev);}function s_oraVer(_s,_v){_v=_s+_v;oraVersion=(oraVersion.indexOf(_s)==-1)?oraVersion+_v:oraVersion.substr(0,oraVersion.indexOf(_s))+_v;}function oraSetInternalFilters(){s.linkInternalFilters="javascript:,.oracle.";if(location.href.indexOf(":8888")||location.href.indexOf("webstandards-us")){s.linkInternalFilters="javascript:,localhost,webstandards-us.oracle.com,.oracle.";}}function gotjQ(){try{var jq=(jQuery)?true:false;}catch(err){var jq=false;}return jq;}function getbCookie(cookiename){try{var i,x,y,ARRcookies=document.cookie.split(";");for(i=0;i<ARRcookies.length;i++){x=ARRcookies[i].substr(0,ARRcookies[i].indexOf("="));y=ARRcookies[i].substr(ARRcookies[i].indexOf("=")+1);x=x.replace(/^\s+|\s+$/g,"");if(x==cookiename){return unescape(y);}}}catch(e){console.log(e);}}function s_setBluekaiData(){var bkData=getbCookie("ORA_WWW_ABMDATA");try{if(typeof(bkData)!="undefined"){bkData=(typeof(bkData)=="string")?JSON.parse(bkData):bkData;s.eVar70=s.eVar71=s.eVar72=s.eVar73=bkData.loaded;s.prop62="NotSet";if(bkData.loaded=="loaded"){var categories;var dataLength=(bkData.data)?(bkData.data.length):0;s.prop62=(bkData.bkId)?(bkData.bkId):"NoValue";s.eVar70=s.eVar71=s.eVar72=s.eVar73="NoValue";for(var i=0;i<dataLength;i++){categories=(bkData.data[i]&&bkData.data[i].categories)?(bkData.data[i].categories):"NoValue";if(bkData.data[i]){if(bkData.data[i].campaignId=="280341"){s.eVar70=bkData.data[i].campaignId+"~"+categories;}else{if(bkData.data[i].campaignId=="280343"){s.eVar71=bkData.data[i].campaignId+"~"+categories;}else{if(bkData.data[i].campaignId=="280348"){s.eVar72=bkData.data[i].campaignId+"~"+categories;}else{if(bkData.data[i].campaignId=="280349"){s.eVar73=bkData.data[i].campaignId+"~"+categories;}}}}}}}}else{s.eVar70=s.eVar71=s.eVar72=s.eVar73=s.prop62="NotSet";}}catch(e){console.log(e);}}if(location.href.indexOf("/costestimator/")!=-1){setTimeout(function(){var wrapperClass=document.getElementsByClassName("oj-inputnumber-wrapper");var currentCost,newCost;currentCost=newCost=(document.getElementsByClassName("ce-config-price-value")[0])?document.getElementsByClassName("ce-config-price-value")[0].innerText:"";var myFunction=function(){newCost=document.getElementsByClassName("ce-config-price-value")[0].innerText;if(currentCost!=newCost){navTrack(s_setAccount()[1],s_setAccount()[2],"rc24:pricing-widget","monthly-cost:"+newCost);currentCost=newCost;}observer.observe(observables,config);};for(var i=0;i<wrapperClass.length;i++){wrapperClass[i].addEventListener("click",myFunction,false);}var observables=document.querySelector(".ce-config-price-value");try{if(observables!=undefined||observables!=null){var observer=new MutationObserver(function(mutations){if(location.href.indexOf("tag=filestorage")!=-1){if(mutations.length>1){var price=document.getElementsByClassName("ce-config-price-value")[0].innerText;navTrack(s_setAccount()[1],s_setAccount()[2],"rc24:pricing-widget","monthly-cost:"+price);}}else{if(mutations.length<2){var price=document.getElementsByClassName("ce-config-price-value")[0].innerText;navTrack(s_setAccount()[1],s_setAccount()[2],"rc24:pricing-widget","monthly-cost:"+price);}}});var config={characterData:true,subtree:true};observer.observe(observables,config);}}catch(e){console.log("Element doesn't exist");}},8000);
/*! JQUERY FUNCTIONS */
}if(gotjQ()){jQuery(document).ready(function($){
/*! TRACKAS MOSAIC */
$("li.cn02menu").each(function(){if(!$(this).find(".cn02w1").attr("data-lbl")&&$(this).find(".cn02w1").get(0)){$(this).find(".cn02w1").attr("data-lbl",$(this).find(".cn02w1").attr("id").toLowerCase().split("cn02-")[1]);}$(this).find("h3 a").attr("data-lbl",$(this).find(".cn02w1").attr("data-lbl"));});$("div.c25w3").each(function(){if(!$(this).parent().attr("data-lbl")){if($(this).find("h3 a").get(0)&&!$(this).find("h3 a").attr("data-lbl")){$(this).parent().attr("data-lbl",$(this).find("h3 a").text().toLowerCase().replace(/ /g,"-").replace(/'/g,""));$(this).find("h3 a").attr("data-trackas","c25w2");}else{if($(this).find("h3 a").get(0)&&$(this).find("h3 a").attr("data-lbl")){$(this).parent().attr("data-lbl",$(this).find("h3 a").attr("data-lbl"));$(this).find("h3 a").attr("data-trackas","c25w2");}else{$(this).parent().attr("data-lbl",$(this).find("h3").text().toLowerCase().replace(/ /g,"-").replace(/'/g,""));}}}$(this).children("a").each(function(){if($(this).attr("data-lbl")){$(this).attr("data-trackas","c25w2");}});});$("form.u01searchform").bind("submit",function(e){if(s_setAccount()[1]){navTrack(s_setAccount()[1],s_setAccount()[2],"header","search");}});$("form.u02searchform").bind("submit",function(e){var searchVal=$(this).find("#txtSearch").val();if(s_setAccount()[1]){navTrack(s_setAccount()[1],s_setAccount()[2],"header","search:"+searchVal);}});$("form.cb149searchform").bind("submit",function(e){var searchVal=$(this).find("#cb149txtSearch").val();if(s_setAccount()[1]){navTrack(s_setAccount()[1],s_setAccount()[2],"cb149:search-center","search:"+searchVal);}});$("div.cb17 form[name=searchForm]").bind("submit",function(e){var searchText=$("div.cb17 form[name=searchForm]").find('input[type="text"]').val();if(s_setAccount()[1]){navTrack(s_setAccount()[1],s_setAccount()[2],"search",searchText);}});
/*! TRACKAS OBJECTS */
var trackas=[["div.c01w4","c01"],["div.c04","c04"],["div.c19w1","social"],["div.c22","c22"],["div.c25w1","c25w1"],["div.c25w2","c25w2"],["div.c26w5","c26w5"],["div.c31","c31"],["div.c37","c37"],["div.c37w2","BillBoard-CTA"],["div.c37w3","c37w3"],["div.c38","c38"],["div.c40","c40"],["div.c48","c48"],["div.c49","c49"],[".c51v0","assets"],[".c51v1","rhs-assets"],[".c51v2","full-width-carousel"],[".c51v3","dual-carousel"],["div.c52w1","c52w1"],["div.c52w2","subfeature"],[".c52v0","subfeature"],["div.c54v1","c54v1"],["div.c54w1","c54w1"],["div.c54w4","c54w4"],[".c54plan","c54plan"],[".c54support","c54support"],[".c54people","c54people"],[".c54sales","c54sales"],[".c54social","c54social"],[".c54apps","c54apps"],[".c54gears","c54gears"],["a.c26link",false,"notrack"],["li.cn02menu","cn02menu"],["li.cn02more","cn02moremenu"],["div.ct02","ct02"],["div.ct05c1","ct05tab"],["div.ct05w2","ct05asset"],["div.ct05c1","ct05c1"],["div.cw01","cw01"],["div.cw01 a.cw01steplink","cw01","resetpage"],["div.cw02","cw02"],["div.cw03","cw03"],["a.cw19prev","cw19prev"],["a.cw19next","cw19next"],["li.cw19thumb","cw19thumb"],["div.w06","w06"],[".s09","live-chat"],[".s11","rhs-assets"],["#atgchat-body","atg-chat"],[".fblike","facebooklike"],[".fbicon","facebook"],[".inicon","linkin"],[".twicon","twitter"],[".yticon","youtube"],[".blicon","oracle-blogs"],["div.f02w2","f02w2"],["div.f02w3","f02w3"],["div.cb21","cb21","expand"],["div.cb21w1","cb21w1","expand-link"],["div.cb13","cb13","herop"],["div.c87","c87"],["div.cb27","cb27"],["div.cw40","cw40"],["div.cw55slide div","cw55slide"],["div.cw56","cw56"]];trackas.push(["div.cw22cta","herocw22cta"],["div.cw22w3","herocw22w3-button"],["div.cw24w2","cw24w2"],["div.cw24img","cw24img-withpopups"],["div.c74w3","c74w3-selectYourRole"],["div.ct06","ct06-carouselMenu"],["div#cw25shuffle","cw25shuffle"],["div.cn11","cn11-getStarted"],["a.cw23facebook","cw23","facebook"],["a.cw23twitter","cw23","twitter"],["a.cw23youtube","cw23","youtube"],["a.cw23linkedin","cw23","linkedin"],["a.cw23blog","cw23","blog"],["a.cw23newsletter","cw23","newsletter"],["ul.cw21navigation","cw21navigation"],["div.ct06w3","ct06-carouselSubMenu"],["div.cn10","cn10"],["div.u01mmenu","header","menu"],["div.u01mlogo","header","logo"],["div.u01msearch","header","search"],["div.ct07w3","ct07w3"],["div.cn07","cn07anchor"],["div.cn12","cn12-anchor-list"],["ul.cw29items","cw29items"],["li.cw30-face","cw30-face"],["a.cw30open","cw30open","+"],["img.cw30-close","cw30-close","x"],["a.cw27close","cw27close","x"],["a.cw27-scroll-up","cw27-scroll","up"],["a.cw27-scroll-down","cw27-scroll","down"],["div.cw27w3","cw27w3"],["div.c75w1","c75w1"],["div.c75w2","c75w2"],["div.cw29","cw29"],["div.cw31w1","cw31w1"],["div.cw31w4","cw31w4"],["div.cw32viewport","cw32viewport"],["div.cw32seeall","cw32seeall"],["div#cw21-socialtab","cw21-socialtab"],["div#cw21-trytab","cw21-trytab"],["div#cw21-demotab","cw21-demotab"],["div.cw20w3","cw20w3","imagethumbs"],["div.cw33w3","cw33w3"],["div.cw36","cw36-panel"],["div.cn14","cn14"],["div.c83","c83"],["div.c84","c84"],["div.c85","c85"],["div.c90","c90"]);trackas.push(["div.c92","c92-topiclinks"],["div.c91w2","c91w2-social"],["div.c93","c93-pressreleases"],["div.cw05","cw05"],["div.cw26w4","cw26w4"],["div.cw34w4","cw34w4"]);trackas.push(["div.cw37w2","cw37w2"],["div.cw38w1","cw38w1"],["ul.cw38icons","cw38icons"],["div.cw38slides","cw38slides"],["div.cw39w1","cw39w1"],["div.c86w1","c86w1"],["div.c75v2hr","c75v2hr"],["div.c78w1","c78w1-carrousel"],["div.c98w1","c98w1"],["div.c81","c81"]);trackas.push(["div.cw52","cw52"],["div.cb09","cb09"],["div.cn20","cn20"],["div.cb10","cb10"]);trackas.push(["div.cb15","cb15"],["div.cw54w3","cw54w3"]);trackas.push(["div.cw53","cw53"],["div.cb28w1","cb28w1"],["a.cw33open","cw33open"],["a.cw33close","cw33close"],["div.cb42","cb42"]);trackas.push(["div.cb25","cb25"]);trackas.push(["div.hp10","hp10"],["div.cn24","cn24"],["div.hp11","hp11"],["div.cb50","cb50"],["div.cn27","cn27"],["div.cb25","cb25"]);trackas.push(["div.cw58","cw58"],["section.cw58","cw58"],["section.cw59","cw59"],["section.cb65","cb65"],["div.cb66","cb66"],["div.cb67","cb67"],["section.ch05","ch05"],["section.ch08","ch08"],["div.u03v4","u03v4"],["div.c80","c80"]);trackas.push(["div.c79","c79"],["div.cb33","cb33"],["nav.ct12","ct12"],["section.cb83","cb83"],["section.cw67","cw67"],["section.cb71","cb71"],["section.cb78","cb78"],["section.cb50","cb50"],["section.cb76","cb76"],["section.cb79","cb79"]);trackas.push(["section.ct13","ct13"],["section.cb82","cb82"]);
/*! TRACKAS LIGHTBOX & OPOP */
$('a[rel*="lightbox"],a[rel*="opop"]').each(function(){if(!$(".f11v1")[0]){var type=($(this).attr("rel")=="opop")?"popup":"lightbox";if(!$(this).attr("data-lbl")&&$(this).attr("title")){$(this).attr("data-lbl",type+"-open-"+$(this).attr("title").toLowerCase().replace(/ /g,"-"));}else{if(!$(this).attr("data-lbl")&&$(this).text()){$(this).attr("data-lbl",type+"-open-"+$(this).text().toLowerCase().replace(/ /g,"-"));}else{if($(this).attr("data-lbl")){$(this).attr("data-lbl",$(this).attr("data-lbl")+"-"+type+"-open");}else{$(this).attr("data-lbl",type+"-open");}}}if(!$(this).attr("data-trackas")){$(this).attr("data-trackas",type);}}});
/*! TRACKAS CODE */
var sn=s_setAccount()[1];var ln=s_setAccount()[2];var isDisplayed={adwcsengine:false};function isElementOnViewport(viewport,divName){var height=$("."+divName).outerHeight();var width=$("."+divName).outerWidth();if(!width||!height){return false;}var bounds=$("."+divName).offset();bounds.right=bounds.left+width;bounds.bottom=bounds.top+height;var visible=(!(viewport.right<bounds.left||viewport.left>bounds.right||viewport.bottom<bounds.top||viewport.top>bounds.bottom));if(!visible){return false;}var deltas={top:Math.min(1,(bounds.bottom-viewport.top)/height),bottom:Math.min(1,(viewport.bottom-bounds.top)/height),left:Math.min(1,(bounds.right-viewport.left)/width),right:Math.min(1,(viewport.right-bounds.left)/width)};return(deltas.left*deltas.right)>=0.5&&(deltas.top*deltas.bottom)>=0.5;}function trackAdDisplayed(){var win=$(window);var viewport={top:win.scrollTop(),left:win.scrollLeft()};viewport.right=viewport.left+win.width();viewport.bottom=viewport.top+win.height();if(isDisplayed.adwcsengine==false&&isElementOnViewport(viewport,"adwcsengine")){isDisplayed.adwcsengine=true;var dataAdName=(typeof($("div.adwcsengine").find(".adwcsengine").attr("data-ad-name")!="undefined"))?$("div.adwcsengine").find(".adwcsengine").attr("data-ad-name"):"~";var dataAdGroupId=(typeof($("div.adwcsengine").find(".adwcsengine").attr("data-adgroupid")!="undefined"))?$("div.adwcsengine").find(".adwcsengine").attr("data-adgroupid"):"~";var dataAdId=(typeof($("div.adwcsengine").find(".adwcsengine").attr("data-adid")!="undefined"))?$("div.adwcsengine").find(".adwcsengine").attr("data-adid"):"~";var dataId=(typeof($("div.adwcsengine").find(".adwcsengine").attr("data-id")!="undefined"))?$("div.adwcsengine").find(".adwcsengine").attr("data-id"):"~";navTrack(sn,ln,"ad-shown","data-ad-name:"+dataAdName+"data-adgroupid:"+dataAdGroupId+"data-adid:"+dataAdId+"data-id:"+dataId);}}trackAdDisplayed();$(window).scroll(function(){trackAdDisplayed();});$(document).on("click","div.cw22snav a,div.cw22bnav a, div.cw22nnav a",function(e){var btxt=$(this).text().replace(/[*,\r\n\t ]+/gi,"");var topORmid=$(this).closest("div.cw22v0").attr("data-trackas");topORmid=(typeof(topORmid)=="undefined")?"cw22-carousel":topORmid;navTrack(sn,ln,topORmid,btxt);});$("li.cw30-face img.cw30-background,li.cw30-face div.cw30-text").bind("click",function(e){var btxt=$(this).closest("li").find("div.cw30-text h3").text();btxt=btxt.replace(/[*,\r\n\t ]+/gi,"");navTrack(sn,ln,"cw30-face",btxt);});$("div.cw29w2 a").bind("click",function(e){var btxt=$(this).closest("a").find("h3.cw29title").text();btxt=btxt.replace(/[*,\r\n\t ]+/gi,"");navTrack(sn,ln,"cw29w2-panel",btxt);});$("ul.cw27topiclist li").bind("click",function(e){var btxt=$(this).text();btxt=btxt.replace(/[*,\r\n\t ]+/gi,"");navTrack(sn,ln,"cw27topiclist",btxt);});$("div.cw21w3 a").bind("click",function(e){navTrack(sn,ln,"cw21w3-scrollto","top");});$("div.cw55slide a.icn-cv-down").bind("click",function(e){navTrack(sn,ln,"cw55slide","down-arrow");});$("div.cw55w3 ul li").bind("click",function(e){var btxt=$(this).closest("li").find("a").text();navTrack(sn,ln,"cw55w3",btxt);});$(document).on("click",'a[href*="download.oracle.com"]',function(e){var dLink=this;if(dLink){s.prop8="D=pageName";var dLinkTxt=dLink.innerHTML.toString();dLinkTxt=dLinkTxt.replace(/&amp;/g,"&");if(dLink.toString().split("?").length>1){if(dLink.name!==""){dLinkTxt=dLink.name;}if(dLinkTxt.indexOf("img")>-1){if(dLinkTxt.indexOf("name")>-1){dLinkTxt=dLinkTxt.substring(dLinkTxt.indexOf('name="')+6,dLinkTxt.length);dLinkTxt=dLinkTxt.substring(0,dLinkTxt.indexOf('"'));}else{if(dLinkTxt.indexOf("alt")>-1){dLinkTxt=dLinkTxt.substring(dLinkTxt.indexOf('alt="')+5,dLinkTxt.length);dLinkTxt=dLinkTxt.substring(0,dLinkTxt.indexOf('"'));}else{dLinkTxt=dLink.href;}}}else{dLinkTxt=dLinkTxt.replace(/.*?:\/\//g,"");}s.eVar29=s.prop23=dLinkTxt;s.eVar15=dLink.href.substring(dLink.href.lastIndexOf("/")+1,dLink.href.length);s.eVar16=dLink.href;s.events=s.apl(s.events,"event15",",",1);s.linkTrackVars="prop8,prop23,eVar29,eVar15,eVar16,events";s.linkTrackEvents="event15";s.tl(dLink,"d",dLink);}}});$(document).on("click","div.cb82w1",function(e){if($(this).attr("data-lbl")){var btxt=$(this).attr("data-lbl");}else{var btxt=($(this).closest("div").find("div.slick-current")[0])?($(this).closest("div").find("div.slick-current")[0].innerText.trim()):"";btxt=(btxt)?btxt.replace(/[*,\r\n\t ]+/gi,"-"):btxt;}navTrack(sn,ln,"cb82",btxt);});$(document).on("click","a.cw32next, a.cw32prev, div.cw32w2 div.cmps-bttns a",function(e){if($(this).attr("data-lbl")){var btxt=$(this).attr("data-lbl");}else{var btxt=$(this).text().trim().replace(/[*,\r\n\t ]+/gi,"-");}navTrack(sn,ln,"cw32",btxt);});$(document).on("click","ul.cw32nav li a",function(e){if($(this).attr("data-lbl")){var btxt=$(this).attr("data-lbl");}else{var btxt=$(this).text().trim().replace(/[*,\r\n\t ]+/gi,"-");}navTrack(sn,ln,"cw32nav",btxt);});$(document).on("click","a.cw26open, a.cw26close, div.cw26w4 a",function(e){var btxt=$(this).text().replace(/[*,\r\n\t ]+/gi,"-");if(btxt==""&&$(this).attr("title")){btxt=$(this).attr("title").replace(/[*,\r\n\t ]+/gi,"");}navTrack(sn,ln,"cw26-spotlight",btxt);if((btxt.indexOf("prev")==-1&&btxt.indexOf("next")==-1)&&(btxt.indexOf("open")==-1&&btxt.indexOf("close")==-1)){trackPersonalization($(this));}});$(document).on("click","div.cw22w3",function(e){trackPersonalization($(this));});$("div.cw28w1").bind("click",function(e){var btxt=$(this).parent().find("img.cw28-background").attr("alt");navTrack(sn,ln,"cw28w1-expand",btxt);});$("div.cw28-detail").bind("click",function(e){if(e.target.className.indexOf("cw28-close")!=-1){var btxt=$(this).parent().find("img.cw28-background").attr("alt");navTrack(sn,ln,"cw28w1-close",btxt);}});$("div.cw28-capabilities").bind("click",function(e){var btxt=$(this).find("a").text().replace(/[*,\r\n\t]+/gi,"").trim();btxt=btxt.replace(/[" "]/g,"-");var title=$(this).parent().find("img.cw28-background").attr("alt");title=(title!="undefined"||title!="")?title+":":"";navTrack(sn,ln,"cw28-capabilities",title+btxt);});$(document).on("click","div.u02modw1 a",function(e){var btxt=$(this).attr("data-lbl");navTrack(sn,ln,"header:call:popup",btxt);});$(document).on("click","li.u02menu-hasm a",function(e){if(!$(this).attr("data-lbl")){var btxt=$(this).siblings(".u02menu-l2").attr("data-lbl");var btxt1=$(this).siblings(".u02menu-l3").attr("data-lbl");btxt=(btxt!="undefined"||btxt!="")?btxt:"";btxt1=(btxt1!="undefined"||btxt1!="")?btxt1:"";$(this).attr("data-lbl",btxt||btxt1);}});$(document).on("click","a.u02clink",function(e){if(!$(this).attr("data-lbl")){var btxt=$(this).siblings(".u02cmenu-l2").attr("data-lbl");btxt=(btxt!="undefined"||btxt!="")?btxt:"";$(this).attr("data-lbl",btxt);}});$(document).on("click","a.u02blink",function(e){if(!$(this).attr("data-lbl")){$(this).attr("data-lbl","back");}});$("div.hp10arrows button").bind("click",function(e){if($(this).attr("class").indexOf("prev")!=-1){var arrowTxt="prev";}else{var arrowTxt="next";}var slideNo=$("div.hp10w2.slick-slide.slick-current.slick-active").attr("data-lbl").split(":")[1];var btxt=$("div.hp10w2.slick-slide.slick-current.slick-active").find("div.hp10w4").attr("data-lbl");navTrack(sn,ln,"hp10","hp:"+arrowTxt+":show-"+slideNo+":"+btxt);});$("div.hp10 ul.slick-dots li").bind("click",function(e){var slideNo=$(this).text();var btxt=$("div.hp10w2.slick-slide.slick-current.slick-active").find("div.hp10w4").attr("data-lbl");navTrack(sn,ln,"hp10","hp:radionav:show-hero"+slideNo+":"+btxt);});$("div#hp11filters ul li a").bind("click",function(e){var btxt=$("div.hp11w2.hp11BasePanel.currentpanel").attr("data-lbl").replace(/[*,\r\n\t ]+/gi,"-");navTrack(sn,ln,"hp11",btxt);});$("div.cw58nav ul.slick-dots li").bind("click",function(e){var slideNo=$(this).text();var btxt=($("div.cw58").attr("data-lbl"))?($("div.cw58").attr("data-lbl")+":"):"";navTrack(sn,ln,"cw58","radionav"+slideNo+btxt);});$("div.cw58nav button").bind("click",function(e){if($(this).attr("class").indexOf("prev")!=-1){var arrowTxt="previous";}else{var arrowTxt="next";}var btxt=($("div.cw58").attr("data-lbl"))?($("div.cw58").attr("data-lbl")+":"):"";navTrack(sn,ln,"cw58",btxt+arrowTxt);});$("ul.ct11tabs li").bind("click",function(e){var btxt=($(this).attr("data-tab"))?($(this).attr("data-tab")):"";navTrack(sn,ln,"ct11tabs",btxt);});$("div.cw60 a").bind("click",function(e){var btxt=$(this).text().trim().replace(/[*,\r\n\t ]+/gi,"-");var btxt1=($(this).attr("data-lbl"))?($(this).attr("data-lbl")):btxt;navTrack(sn,ln,"cw60",btxt1);});$("section.cw64 li").bind("click",function(e){var btxt=$(this).text().trim().replace(/[*,\r\n\t ]+/gi,"-");btxt=(btxt)?btxt.split("-")[0]:"";navTrack(sn,ln,"cw64",btxt);});$(document).on("click","section.cw65 ul.slick-dots li",function(e){var slideNo=$(this).text();navTrack(sn,ln,"cw65","slick-dots:"+slideNo);});$(document).on("click","section.cw67 div.expando-btn",function(e){var btxt=$(this).attr("class");if(btxt.indexOf("expanded")!=-1){navTrack(sn,ln,"expando-btn","close");}else{navTrack(sn,ln,"expando-btn","expand");}});$("div.expando-btn").bind("click",function(e){var btxt=$(this).attr("class");if(btxt.indexOf("expanded")!=-1){navTrack(sn,ln,"expando-btn","close");}else{navTrack(sn,ln,"expando-btn","expand");}});$(document).on("click","section.cw66 div.cw66w5",function(e){var btxt=$(this).attr("data-lbl")||$(this).children().closest("h4")[0].innerText.replace(/[*,\r\n\t ]+/gi,"-");navTrack(sn,ln,"cw66tile",btxt);});window.onload=function(){$("section.cb83 div.expando-btn").attr("onclick",setActivityMapTracking);$("section.cw67 div.expando-btn").attr("onclick",setActivityMapTracking);$("section.cw66 div.cw66w5").attr("onclick",setActivityMapTracking);$("section.cw65 ul.slick-dots li").attr("onclick",setActivityMapTracking);$("section.cw65 a.slick-prev").attr("onclick",setActivityMapTracking);$("section.cw65 a.slick-next").attr("onclick",setActivityMapTracking);};function setActivityMapTracking(e){return true;}$("div.fp-controlArrow").bind("click",function(e){if($(this).attr("class").indexOf("prev")!=-1){var arrowTxt="previous";}else{var arrowTxt="next";}navTrack(sn,ln,"slidearrow-autodb",arrowTxt);});$(document).on("click","div.tr-reviews-viewport a",function(e){if(!$(this).attr("data-lbl")){var ele=$(this);var btxt=$(ele).closest(".tr-card")[0].querySelector(".tr-review-title a").innerText;btxt=btxt.replace(/[*,\r\n\t ]+/gi,"-");$(this).attr("data-lbl",btxt);}});$(document).on("click","section.cb152 .expando-btn",function(e){var btxt=$(this).attr("class");if(btxt.indexOf("expanded")!=-1){navTrack(sn,ln,"cb152-expando-btn","close");}else{navTrack(sn,ln,"cb152-expando-btn","expand");}});$("section.cb129").on("click",".cb129w3 h4, .cb129w3 .cb129icn",function(e){var type,eleText;if(e.target.tagName=="H4"){type="title";eleText=e.target.innerText;}else{type=($(e.target).hasClass("icn-arrow"))?"arrow":($(e.target).hasClass("icn-plus")?"open":($(e.target).hasClass("icn-min")?"close":""));eleText=$(e.target).parent().find("h4").text();}eleText=eleText.replace(/[*,\r\n\t ]+/gi,"-");navTrack(sn,ln,type,eleText);});function trackPersonalization(divName){var o=divName;if(typeof(o.closest("[data-personalization-state]").attr("data-personalization-state"))!="undefined"){var p_dataPersonalizationState=o.closest("[data-personalization-state]").attr("data-personalization-state");var p_dataPersonalizedBy=(typeof(o.closest("[data-personalized-by]").attr("data-personalized-by")!="undefined"))?o.closest("[data-personalized-by]").attr("data-personalized-by"):"~";var p_dataId=(typeof(o.closest("[data-data-id]").attr("data-id")!="undefined"))?o.closest("[data-id]").attr("data-id"):"~";var p_dataContentId=(typeof(o.closest("[data-content-id]").attr("data-content-id")!="undefined"))?o.closest("[data-content-id]").attr("data-content-id"):"~";p_dataPersonalizedBy="_"+p_dataPersonalizedBy.toLowerCase().replace(/,/g,"_").replace(/-+/g,"_");if(p_dataPersonalizationState!=""){var contentTitle="";if(o.closest("div.cw26").length>0){contentTitle=(typeof(o.closest("div.cw26w2").find("div.cw26w3").find("h5").text())!="undefined")?o.closest("div.cw26w2").find("div.cw26w3").find("h5").text().trim():"";}else{contentTitle=o.find("h2").text();}navTrack(sn,"personalized",p_dataPersonalizationState+":"+p_dataPersonalizedBy+":"+p_dataId+":"+p_dataContentId,contentTitle);}}}for(var i=0;i<trackas.length;i++){if(!$(trackas[i][0]).attr("data-trackas")&&trackas[i][1]){$(trackas[i][0]).attr("data-trackas",trackas[i][1]);}if(trackas[i][2]&&trackas[i][2]=="resetpage"){$(trackas[i][0]).attr("data-pgreset","true");}else{if(trackas[i][2]&&!$(trackas[i][0]).attr("data-lbl")){$(trackas[i][0]).attr("data-lbl",trackas[i][2]);}}}$(document).on("click","*[data-trackas] a,a[data-trackas],*[data-trackas] button,button[data-trackas]",function(e){var lbl="";var o=$(this);if(o.attr("data-lbl")!="notrack"){if(o.attr("data-lbl")){lbl=o.attr("data-lbl");}else{if(o.attr("name")){lbl=o.attr("name");}else{if(o.attr("title")){lbl=o.attr("title");}else{if(o.find("img")&&o.find("img").first().attr("title")){lbl=o.find("img").first().attr("title");}else{if(o.find("img")&&o.find("img").first().attr("alt")){lbl=o.find("img").first().attr("alt");}else{if(o.find("img").first().attr("src")){lbl=o.find("img").first().attr("src");lbl=lbl.split("/")[(lbl.split("/").length-1)];}else{lbl=o.text();}}}}}}var d=o.closest("[data-trackas]").attr("data-trackas");d=(d=="hnav"||d=="header"||d=="hp07"||d=="hp08"||d=="hp09"||d=="menu"||d=="hp10"||d=="cn24"||d=="hp11"||d=="cb50"||d=="cn27"||d=="cb25"||d=="ch05"||d=="cw58"||d=="cw59"||d=="cb65"||d=="cb66"||d=="cb67")?":":"-";if(!o.attr("data-trackas")){while(o.parent()){o=o.parent();if(o.attr("data-lbl")){lbl=o.attr("data-lbl")+d+lbl;}if(o.attr("data-trackas")){break;}}}lbl=lbl.toLowerCase().replace(/ /g,"-").replace(/-+/g,"-");var sec=(o.attr("data-trackas"))?o.attr("data-trackas"):o.closest("*[data-trackas]").attr("data-trackas");if(sec!="cw22-carouseltop"){navTrack(sn,ln,sec,lbl);}if(o.attr("data-pgreset")=="true"){s.clearVars();if(o.attr("href").indexOf("#")==0&&s.pageName){if(!$("body").attr("data-pgname")){$("body").attr("data-pgname",s.pageName);var pn=s.pageName;}else{var pn=$("body").attr("data-pgname");}s.pageName=pn+"/"+o.attr("href").split("#")[1];}else{s_orapageName(o.attr("href"));}oraSetInternalFilters();s.linkInternalFilters=s.linkInternalFilters+","+o.attr("href");var s_code=s.t();if(s_code){document.write(s_code);}oraSetInternalFilters();}}});});}