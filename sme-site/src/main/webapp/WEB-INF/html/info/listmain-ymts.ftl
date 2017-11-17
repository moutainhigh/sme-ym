<div class="main_w">
		<div class="w1000">
			<div class="news_l">
				<div class="list_tab">
					<div class="tt_title fl">
					<#if currChannel ??>
					${currChannel.title}
					<#else>
					玉门特色
					</#if>
					</div>
				</div>
				<@sme_info_page num="5" page="${page!1}" titlelen="25" dateformat="yyyy-MM-dd" channelid="${id}";infolist,pager>
				<ul class="l_list">
					<#list infolist as info>
						<li><a href="${info.url}" title="${info.title}" target="_blank">
							<!--<span><img src="${info.img}" height="60px" width="80px" /> </span>-->
							<span>${info.title}</span>
							<span class="time">${info.addtimestr}</span>
						</a></li>
					</#list>
				</ul>
				${pager.numPageStr}
				</@sme_info_page>
			</div>
			
			<div class="news_r">
				<div class="box">
					<div class="title">
						<span></span>热点新闻
					</div>
					<div class="content">
						<ul class="main">
							<@sme_info_list num="10" titlelen="15" dateformat="yyyy-MM-dd";info,index>
							<li><a href="${info.url}" target="_blank" title="${info.title}">${info.showtitle}…</a></li>
							</@sme_info_list>
						</ul>
					</div>
				</div>
			</div>
			
			<div class="news_l">
				<div class="list_tab">
					<div class="tt_title fl">
					文化旅游
					</div>
				</div>
				<@sme_info_page num="5" page="${page!1}" titlelen="25" dateformat="yyyy-MM-dd" channelid="${id}";infolist,pager>
				<ul class="l_list">
					<#list infolist as info>
						<li><a href="${info.url}" title="${info.title}" target="_blank">
							<span>${info.title}</span>
							<span class="time">${info.addtimestr}</span>
						</a></li>
					</#list>
				</ul>
				${pager.numPageStr}
				</@sme_info_page>
			</div>
		</div>
	</div>

	<div class="clear"></div>