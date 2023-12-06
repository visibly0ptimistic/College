//tealium universal tag - utag.14 ut4.0.202308231908, Copyright 2023 Tealium.com Inc. All Rights Reserved.
try{(function(id,loader){var u={"id":id};utag.o[loader].sender[id]=u;if(utag.ut===undefined){utag.ut={};}
var match=/ut\d\.(\d*)\..*/.exec(utag.cfg.v);if(utag.ut.loader===undefined||!match||parseInt(match[1])<41){u.loader=function(o,a,b,c,l,m){utag.DB(o);a=document;if(o.type=="iframe"){m=a.getElementById(o.id);if(m&&m.tagName=="IFRAME"){b=m;}else{b=a.createElement("iframe");}o.attrs=o.attrs||{};utag.ut.merge(o.attrs,{"height":"1","width":"1","style":"display:none"},0);}else if(o.type=="img"){utag.DB("Attach img: "+o.src);b=new Image();}else{b=a.createElement("script");b.language="javascript";b.type="text/javascript";b.async=1;b.charset="utf-8";}if(o.id){b.id=o.id;}for(l in utag.loader.GV(o.attrs)){b.setAttribute(l,o.attrs[l]);}b.setAttribute("src",o.src);if(typeof o.cb=="function"){if(b.addEventListener){b.addEventListener("load",function(){o.cb();},false);}else{b.onreadystatechange=function(){if(this.readyState=="complete"||this.readyState=="loaded"){this.onreadystatechange=null;o.cb();}};}}if(o.type!="img"&&!m){l=o.loc||"head";c=a.getElementsByTagName(l)[0];if(c){utag.DB("Attach to "+l+": "+o.src);if(l=="script"){c.parentNode.insertBefore(b,c);}else{c.appendChild(b);}}}};}else{u.loader=utag.ut.loader;}
if(utag.ut.typeOf===undefined){u.typeOf=function(e){return({}).toString.call(e).match(/\s([a-zA-Z]+)/)[1].toLowerCase();};}else{u.typeOf=utag.ut.typeOf;}
u.ev={"view":1,"link":1};u.hasOwn=function(o,a){return o!=null&&Object.prototype.hasOwnProperty.call(o,a);};u.isEmptyObject=function(o,a){for(a in o){if(u.hasOwn(o,a)){return false;}}return true;};u.toBoolean=function(val){val=val||"";return val===true||val.toLowerCase()==="true"||val.toLowerCase()==="on";};u.hasgtagjs=function(){window.gtagRename=window.gtagRename||""||"gtag";if(utag.ut.gtagScriptRequested){return true;}
var i,s=document.getElementsByTagName("script");for(i=0;i<s.length;i++){if(s[i].src&&s[i].src.indexOf("gtag/js")>=0&&(s[i].id&&s[i].id.indexOf('utag')>-1)){return true;}}
var data_layer_name=""||"dataLayer";window[data_layer_name]=window[data_layer_name]||[];if(typeof window[window.gtagRename]!=="function"){window[window.gtagRename]=function(){window[data_layer_name].push(arguments);};var cross_track_domains="";if(cross_track_domains!==""){window[window.gtagRename]("set","linker",{domains:cross_track_domains.split(","),accept_incoming:true});}
window[window.gtagRename]("js",new Date());}
return false;};u.scriptrequested=u.hasgtagjs();u.o=window[window.gtagRename];u.map_func=function(arr,obj,item){var i=arr.shift();obj[i]=obj[i]||{};if(arr.length>0){u.map_func(arr,obj[i],item);}else{obj[i]=item;}};u.map={"google_advertiser_id":"advertiser_id","activity_group":"activity_group","activity":"activity","counting_method":"counting_method","conversion_should_fire:true":"conversion","page_name":"custom.u1","site_id":"custom.u2","user_type":"custom.u3","meta.keywords":"custom.u4","login_status":"custom.u5","_sm_14_11":"custom.u6","_sm_14_12":"custom.u7","_sm_14_13":"custom.u8","_sm_14_14":"custom.u9","_sm_14_15":"custom.u10","user_action":"custom.u11","global_id":"custom.u12","_sm_14_18":"custom.u13","video_title":"custom.u14","link_name":"custom.u15","file_download":"custom.u16","page_href":"custom.u17"};u.extend=[function(a,b){try{b['_sm_14_11']="{COMPANY]";}catch(e){utag.DB(e);}
try{b['_sm_14_12']="[JOB TITLE]";}catch(e){utag.DB(e);}
try{b['_sm_14_13']="[CITY]";}catch(e){utag.DB(e);}
try{b['_sm_14_14']="[STATE]";}catch(e){utag.DB(e);}
try{b['_sm_14_15']="[ZIP]";}catch(e){utag.DB(e);}
try{b['_sm_14_18']="[COMPANY SIZE]";}catch(e){utag.DB(e);}},function(a,b){try{if(1){if(typeof utag_data=='undefined'){utag_data=b;}
function addLoadEvent(func){if(window.addEventListener){window.addEventListener('load',func);}else{window.attachEvent('onload',func);}}
if(typeof window.s_pageName!='undefined'){console.log(window.s_pageName);if(typeof utag_data!='undefined'){console.log("in if utag data");utag_data['page_name']=window.s_pageName;}else{console.log("in else utag data");}}
function loadUberTag(){document.removeEventListener('touchstart',loadUberTag);document.removeEventListener('scroll',loadUberTag);if(utag_data['consent_implied']){var explicit_countries=['AT','BE','BG','HR','CY','CZ','DK','EE','FI','FR','DE','GR','HU','IE','IT','KR','LV','LT','LU','MT','NL','NO','PL','PT','RO','SK','SI','ES','SE','CH','GB','SG','BA','GI','ME','RS','CA','CO'];if(utag_data['visitor_geo']&&utag_data['visitor_geo'].country_code){if(!explicit_countries.includes(utag_data['visitor_geo'].country_code)){utag.view(window.utag.data,null,[id]);}}else if(utag_data['cp.notice_behavior']){if(utag_data['cp.notice_behavior'].indexOf('implied')!=-1){utag.view(_data,null,[_id]);}}else{setTimeout(function(){if(utag_data['visitor_geo']&&utag_data['visitor_geo'].country_code){if(!explicit_countries.includes(utag_data['visitor_geo'].country_code)){utag.view(_data,null,[_id]);}}},1000)}}else{utag.view(window.utag.data,null,[id]);}}
utag.onload_flag=utag.onload_flag||{};if(!utag.onload_flag[id]){if(document.readyState!="complete"){if(window.utag.data.is_mobile){document.addEventListener('scroll',loadUberTag,{once:true});document.addEventListener('touchstart',loadUberTag,{once:true});}else{addLoadEvent(function(){if(utag_data['consent_implied']){var explicit_countries=['AT','BE','BG','HR','CY','CZ','DK','EE','FI','FR','DE','GR','HU','IE','IT','KR','LV','LT','LU','MT','NL','NO','PL','PT','RO','SK','SI','ES','SE','CH','GB','SG','BA','GI','ME','RS','CA','CO'];if(utag_data['visitor_geo']&&utag_data['visitor_geo'].country_code){if(!explicit_countries.includes(utag_data['visitor_geo'].country_code)){utag.view(window.utag.data,null,[id]);}}else if(utag_data['cp.notice_behavior']){if(utag_data['cp.notice_behavior'].indexOf('implied')!=-1){utag.view(window.utag.data,null,[id]);}}else{setTimeout(function(){if(utag_data['visitor_geo']&&utag_data['visitor_geo'].country_code){if(!explicit_countries.includes(utag_data['visitor_geo'].country_code)){utag.view(window.utag.data,null,[id]);}}},1000)}}else{utag.view(window.utag.data,null,[id]);}});}
return false;}
utag.onload_flag[id]=1;}}}catch(e){utag.DB(e)}},function(a,b){try{if(1){try{if(typeof window.s!='undefined'&&typeof window.s.events!='undefined'){b.events=window.s.events;}
}catch(e){utag.DB(e);}}}catch(e){utag.DB(e)}},function(a,b,c,d,e,f,g){if(1){d=b['page_region'];if(typeof d=='undefined')return;c=[{'nas':'DC-3573281'},{'apac':'DC-1106306'},{'lad':'DC-3573286'},{'emea':'DC-3573292'}];var m=false;for(e=0;e<c.length;e++){for(f in utag.loader.GV(c[e])){if(d==f){b['google_advertiser_id']=c[e][f];m=true};};if(m)break};}},function(a,b){try{if((typeof b['events']!='undefined'&&/^(?!(\b(event1|event3|event9|event10|event11|event15|event18|event22|event23|event26|event27|event116)\b))/.test(b['events'])&&typeof b['ut.event']!='undefined'&&b['ut.event'].toString().toLowerCase().indexOf('view'.toLowerCase())>-1)||(typeof b['events']=='undefined'&&typeof b['page_name']!='undefined'&&b['page_name'].toString().toLowerCase().indexOf('Thank'.toLowerCase())<0&&typeof b['ut.event']!='undefined'&&b['ut.event'].toString().toLowerCase().indexOf('view'.toLowerCase())>-1)||(typeof b['events']=='undefined'&&typeof b['page_name']=='undefined'&&typeof b['ut.event']!='undefined'&&b['ut.event'].toString().toLowerCase().indexOf('view'.toLowerCase())>-1)||(typeof b['location_hostname']!='undefined'&&/go(\-stage)?\.oracle\.com/.test(b['location_hostname'])&&typeof b['events']!='undefined'&&/\b(event1|event8)\b/.test(b['events'])&&typeof b['ut.event']!='undefined'&&b['ut.event'].toString().indexOf('view')>-1)){b['activity']='awarn0';b['activity_group']='ubert0';b['counting_method']='unique'}}catch(e){utag.DB(e);}},function(a,b){try{if((typeof b['events']!='undefined'&&b['events'].toString().toLowerCase().indexOf('event3'.toLowerCase())>-1)||(typeof b['page_name']!='undefined'&&b['page_name'].toString().toLowerCase().indexOf('thank'.toLowerCase())>-1)||(typeof b['user_action']!='undefined'&&b['user_action'].toString().toLowerCase().indexOf('success=true'.toLowerCase())>-1)||(typeof b['events']!='undefined'&&b['events'].toString().toLowerCase().indexOf('event9'.toLowerCase())>-1)||(typeof b['dom.query_string']!='undefined'&&b['dom.query_string'].toString().toLowerCase().indexOf('success=true'.toLowerCase())>-1)||(typeof b['dom.query_string']!='undefined'&&b['dom.query_string'].toString().toLowerCase().indexOf('ty=yes'.toLowerCase())>-1)||(typeof b['events']!='undefined'&&b['events'].toString().toLowerCase().indexOf('event116'.toLowerCase())>-1)){b['activity']='formc0';b['activity_group']='ubert0';b['counting_method']='standard';try{b['user_action']=b.user_action?b.user_action.replace(/[=]/g,"-"):""}catch(e){}}}catch(e){utag.DB(e);}},function(a,b){try{if((typeof b['location_hostname']!='undefined'&&/^(?!(\b(go(\-stage)?\.oracle\.com)\b))/.test(b['location_hostname'])&&typeof b['events']!='undefined'&&/\b(event1|event10|event11|event15|event18|event22|event26)\b/.test(b['events']))||(typeof b['location_hostname']!='undefined'&&/go(\-stage)?\.oracle\.com/.test(b['location_hostname'])&&typeof b['events']!='undefined'&&/\b(event2|event10|event11|event15|event18|event22|event26)\b/.test(b['events']))){b['activity']='consi0';b['activity_group']='ubert0';b['counting_method']='standard'}}catch(e){utag.DB(e);}},function(a,b){try{if((typeof b['tealium_event']!='undefined'&&b['tealium_event'].toString().toLowerCase().indexOf('file_download'.toLowerCase())>-1)){b['activity']='consi0';b['activity_group']='ubert0';b['counting_method']='standard'}}catch(e){utag.DB(e);}},function(a,b){try{if((typeof b['tealium_event']!='undefined'&&b['tealium_event'].toString().toLowerCase().indexOf('video_cta'.toLowerCase())>-1)||(typeof b['tealium_event']!='undefined'&&b['tealium_event'].toString().toLowerCase().indexOf('video_view'.toLowerCase())>-1)){b['activity']='consi0';b['activity_group']='ubert0';b['counting_method']='standard'}}catch(e){utag.DB(e);}},function(a,b){try{if(typeof b['video_title']=='undefined'||typeof b['video_title']!='undefined'&&b['video_title']==''){b['video_title']='Not Available'}}catch(e){utag.DB(e);}},function(a,b){try{if(typeof b['link_name']=='undefined'||typeof b['link_name']!='undefined'&&b['link_name']==''){b['link_name']='Not Available'}}catch(e){utag.DB(e);}},function(a,b){try{if(typeof b['file_download']=='undefined'||typeof b['file_download']!='undefined'&&b['file_download']==''){b['file_download']='Not Available'}}catch(e){utag.DB(e);}},function(a,b){try{if((typeof b['activity']!='undefined'&&b['activity']!=''&&typeof b['activity_group']!='undefined'&&b['activity_group']!=''&&typeof b['counting_method']!='undefined'&&b['counting_method']!=''&&typeof b['google_advertiser_id']!='undefined'&&b['google_advertiser_id']!='')){b['conversion_should_fire']='true'}}catch(e){utag.DB(e);}},function(a,b){try{if(typeof b['meta.keywords']=='undefined'||typeof b['meta.keywords']!='undefined'&&b['meta.keywords']==''){b['meta.keywords']='Not Available'}}catch(e){utag.DB(e);}},function(a,b){try{if(1){try{if(typeof b.events!='undefined'&&b.events!=''&&typeof b.user_action!='undefined'&&b.user_action!=''&&a=="view"){var event_name;switch(b.events){case"event1":case"event8":event_name="Welcome";break;case"event2":event_name="Landing Page/Pad Step2:Survey";break;case"event3":event_name="Landing Page/Pad Step3:Thanks";break;case"event9":event_name="Step3:Thanks";break;case"event10":event_name="Step2:Reg";break;case"event22":event_name="OOW/Javaone Registration Started";break;case"event23":event_name="OOW/Javaone Registration Complete";break;case"event26":event_name="Trial/Demo Registration Welcome";break;case"event27":event_name="Trial/Demo Registration Confirmed";break;}
if(typeof event_name!='undefined'&&event_name!=''){b.user_action=b.user_action+":"+b.events+"-"+event_name;}}}catch(e){utag.DB(e);}}}catch(e){utag.DB(e)}},function(a,b){try{if((typeof b['meta.keywords']!='undefined'&&typeof b['meta.keywords']!='undefined'&&b['meta.keywords']!='')){try{b['meta.keywords']=encodeURIComponent(b['meta.keywords'].replace(/'/g,"%27"));}catch(e){}}}catch(e){utag.DB(e);}}];u.send=function(a,b){if(u.ev[a]||u.ev.all!==undefined){utag.DB("send:14");utag.DB(b);var c,d,e,f,h,i,j,k,_event,p,key;u.data={"qsp_delim":"&","kvp_delim":"=","base_url":"https://www.googletagmanager.com/gtag/js","advertiser_id":"","activity_group":"","activity":"","counting_method":"","fire_purchase":"false","custom_scripts":"true","data_layer_name":"","session_id":"","product_id":[],"product_quantity":[],"product_unit_price":[],"dc_custom_params":{},"event_name":"","event":[],"custom":{}};for(c=0;c<u.extend.length;c++){try{d=u.extend[c](a,b);if(d==false)return}catch(e){}};utag.DB("send:14:EXTENSIONS");utag.DB(b);for(d in utag.loader.GV(u.map)){if(b[d]!==undefined&&b[d]!==""){e=u.map[d].split(",");for(f=0;f<e.length;f++){u.map_func(e[f].split("."),u.data,b[d]);}}else{h=d.split(":");if(h.length===2&&b[h[0]]===h[1]){if(u.map[d]){u.data.event=u.data.event.concat(u.map[d].split(","));}}}}
utag.DB("send:14:MAPPINGS");utag.DB(u.data);u.data.order_id=u.data.order_id||b._corder||"";u.data.order_total=u.data.order_total||b._ctotal||"";if(u.data.product_quantity.length===0&&b._cquan!==undefined){u.data.product_quantity=b._cquan.slice(0);}
if(typeof(u.data.advertiser_id)==="string"&&u.data.advertiser_id!==""){u.data.advertiser_id=u.data.advertiser_id.split(",");}
if(typeof(u.data.activity_group)==="string"){u.data.activity_group=u.data.activity_group.split(",");}
if(typeof(u.data.activity)==="string"){u.data.activity=u.data.activity.split(",");}
if(typeof(u.data.counting_method)==="string"){u.data.counting_method=u.data.counting_method.split(",");}
if(typeof(u.data.session_id)==="string"){u.data.session_id=u.data.session_id.split(",");}
if(u.data.product_id.length===0&&b._cprod!==undefined){u.data.product_id=b._cprod.slice(0);}
if(u.data.product_quantity.length===0&&b._cquan!==undefined){u.data.product_quantity=b._cquan.slice(0);}
if(u.data.product_unit_price.length===0&&b._cprice!==undefined){u.data.product_unit_price=b._cprice.slice(0);}
if(!u.data.advertiser_id){utag.DB(u.id+": Tag not fired: Required attribute not populated");return;}
if(u.data.gtag_enable_tcf_support){window["gtag_enable_tcf_support"]=u.toBoolean(u.data.gtag_enable_tcf_support);}
u.o("set",{"developer_id.dYmQxMT":true});for(i=0;i<u.data.advertiser_id.length;i++){if(!/^[a-zA-Z]{2}-/.test(u.data.advertiser_id[i])){u.data.advertiser_id[i]="DC-"+u.data.advertiser_id[i];}}
u.data.base_url+="?id="+(u.data.advertiser_id[0]);if(u.data.data_layer_name){u.data.base_url=u.data.base_url+"&l="+u.data.data_layer_name;}
for(i=0;i<u.data.advertiser_id.length;i++){u.o("config",u.data.advertiser_id[i]);}
if(u.data.order_id){for(i=0;i<u.data.event.length;i++){if(u.data.event[i]==="purchase"){p=true;}}
if(!p&&u.toBoolean(u.data.fire_purchase)){u.data.event.push("purchase");if(u.data.counting_method[0]===""){u.data.counting_method[0]="transactions";}}}
var total_qty=0;if(typeof(u.data.product_quantity)==="number"){total_qty=u.data.product_quantity;}else if(u.data.product_quantity.length===1){total_qty=u.data.product_quantity[0];}else if(u.data.product_quantity.length>1){for(i=0;i<u.data.product_quantity.length;i++){total_qty+=parseInt(u.data.product_quantity[i],10);}}else{total_qty=1;}
for(i=0;i<u.data.event.length;i++){_event=u.data.event[i];for(j=0;j<u.data.advertiser_id.length;j++){var eventIdData={};if(u.data.custom_scripts==="true"||u.data.custom_scripts){eventIdData.allow_custom_scripts=true;}else if(u.data.custom_scripts==="false"||!u.data.custom_scripts){eventIdData.allow_custom_scripts=false;}
if(u.data.session_id.length===1&&u.data.session_id[0]!==""){eventIdData.session_id=u.data.session_id[0];}else if(u.data.session_id[j]!==""){eventIdData.session_id=u.data.session_id[j];}
if(u.data.order_total){eventIdData.value=u.data.order_total;eventIdData.transaction_id=u.data.order_id;}
if(u.data.product_quantity){eventIdData.quantity=total_qty;}
eventIdData.items=[];for(k=0;k<u.data.product_id.length;k++){if(typeof(u.data.product_unit_price[k])==="undefined"||typeof(u.data.product_quantity[k])==="undefined"){utag.DB("No matching unit price or quantity for product ID "+u.data.product_id[k]);}else{eventIdData.items.push({"id":u.data.product_id[k],"price":u.data.product_unit_price[k],"quantity":u.data.product_quantity[k]});}}
for(key in u.data.custom){eventIdData[key]=u.data.custom[key];}
if(!u.isEmptyObject(u.data.dc_custom_params)){eventIdData.dc_custom_params={};for(key in u.data.dc_custom_params){eventIdData.dc_custom_params[key]=u.data.dc_custom_params[key];}}
if(u.data.counting_method[j]&&u.data.counting_method[j]!==u.data.counting_method[j].toLowerCase()){u.data.counting_method[j]=u.data.counting_method[j].toLowerCase();utag.DB("Counting Method not supplied in proper case - converted to lower case");}
eventIdData.send_to=u.data.advertiser_id[j]+
"/"+(u.data.activity_group[j]||u.data.activity_group[0])+
"/"+(u.data.activity[j]||u.data.activity[0])+
"+"+(u.data.counting_method[j]||u.data.counting_method[0]);if(_event==="purchase"){u.o("event","purchase",eventIdData);}
if(_event==="conversion"){u.o("event","conversion",eventIdData);}}}
if(!u.hasgtagjs()){u.scriptrequested=true;utag.ut.gtagScriptRequested=true;u.loader({"type":"script","src":u.data.base_url,"cb":null,"loc":"script","id":"utag_14","attrs":{}});}
utag.DB("send:14:COMPLETE");}};utag.o[loader].loader.LOAD(id);}("14","oracle.main"));}catch(error){utag.DB(error);}
