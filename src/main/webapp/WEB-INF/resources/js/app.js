!function(e, t) {
	for ( var a in t)
		e[a] = t[a]
    }
	     (
			window,function(e) {
				function t(r) {
					if (a[r])
						return a[r].exports;
					var n = a[r] = {
						exports : {},
						id : r,
						loaded : !1
					};
					return e[r].call(n.exports, n, n.exports, t),
							n.loaded = !0, n.exports
				}
				var a = {};
				return t.m = e, t.c = a, t.p = "", t(0)
			}
			({
				0 : function(e, t, a) {
					"use strict";
					var r = a(2), n = a(80), s = a(81), l = a(83), i = a(82);
							r
									.render(
											r
													.createElement(
															n, null),
											document
													.getElementById("mod-banner")),
							r
									.render(
											r
													.createElement(
															s, null),
											document
													.getElementById("mod-dynamic")),
							r
									.render(
											r
													.createElement(
															l, null),
											document
													.getElementById("mod-story")),
							r
									.render(
											r
													.createElement(
															i, null),
											document
													.getElementById("mod-faq"))
				},
							1 : function(e, t) {
								!function() {
									e.exports = window["@ali/op-base"]
								}()
							},
							2 : function(e, t) {
								!function() {
									e.exports = window["@ali/op-base"]["react/addons"]
								}()
							},
							3 : function(e, t) {
								!function() {
									e.exports = window["@ali/op-base"].lodash
								}()
							},
							9 : function(e, t) {
								!function() {
									e.exports = window["@ali/op-base"]["@ali/backbone"]
								}()
							},
							80 : function(e, t, a) {
								"use strict";
								var r = a(2), n = a(1).ExSlide, s = a(1).ExSlideContent, l = a(84), i = r
										.createClass({
											displayName : "Banner",
											propTypes : {
												renderData : r.PropTypes.object
											},
											getDefaultProps : function() {
												return {
													renderData : (new l)
															.get("data")
												}
											},
											renderSlideContent : function() {
												var e = {};
												return
														this.props.renderData.list
																&& this.props.renderData.list
																		.forEach(function(
																				t,
																				a) {
																			e["bannerList-"
																					+ a] = r
																					.createElement(
																							s,
																							null,
																							r
																									.createElement(
																											"a",
																											{
																												href : t.url,
																												target : "_blank",
																												className : "bg",
																												style : {
																													backgroundImage : "url("
																															+ t.imgUrl
																															+ ")"
																												}
																											}))
																		}),
														r.addons
																.createFragment(e)
											},
											render : function() {
												var e, t = window.location.search;
												return
														e = t
																.indexOf("_target=http") > -1 ? t
																.match(/_target=([^&]*)/)[1]
																: "//beta.sycm.taobao.com/index.htm",
														r
																.createElement(
																		"div",
																		{
																			className : "banner-wrapper"
																		},
																		r
																				.createElement(
																						"div",
																						{
																							className : "login-box"
																						},
																						r
																								.createElement(
																										"iframe",
																										{
																											src : "https://login.taobao.com/member/login.jhtml?from=sycm&full_redirect=true&style=minisimple&minititle=&minipara=0,0,0&sub=true&redirect_url="
																													+ e,
																											frameBorder : "0",
																											scrolling : "no",
																											height : "248",
																											width : "100%"
																										})),
																		r
																				.createElement(
																						"div",
																						{
																							className : "slide-wrapper"
																						},
																						r
																								.createElement(
																										n,
																										{
																											activeIndex : 0,
																											effect : "fade"
																										},
																										this
																												.renderSlideContent())))
											}
										});
								e.exports = i
							},
							81 : function(e, t, a) {
								"use strict";
								var r = a(2), n = a(85), s = r
										.createClass({
											displayName : "Dynamic",
											propTypes : {
												renderData : r.PropTypes.object
											},
											getDefaultProps : function() {
												return {
													renderData : (new n)
															.get("data")
												}
											},
											renderDynamicList : function() {
												var e = {};
												return
														this.props.renderData.dynamic
																&& this.props.renderData.dynamic
																		.forEach(function(
																				t,
																				a) {
																			e["dynamicList-"
																					+ a] = r
																					.createElement(
																							"li",
																							null,
																							r
																									.createElement(
																											"a",
																											{
																												href : t.url,
																												title : t.title,
																												target : "_blank"
																											},
																											t.title))
																		}),
														r.addons
																.createFragment(e)
											},
											render : function() {
												return r
														.createElement(
																"div",
																null,
																r
																		.createElement(
																				"span",
																				{
																					className : "icon-dynamic"
																				}),
																r
																		.createElement(
																				"div",
																				{
																					className : "content"
																				},
																				r
																						.createElement(
																								"h4",
																								{
																									className : "title sans-serif"
																								},
																								"官方动态"),
																				r
																						.createElement(
																								"ul",
																								{
																									className : "menu"
																								},
																								this
																										.renderDynamicList())))
											}
										});
								e.exports = s
							},
							82 : function(e, t, a) {
								"use strict";
								var r = a(2), n = a(86), s = r
										.createClass({
											displayName : "Faq",
											propTypes : {
												renderData : r.PropTypes.object
											},
											getDefaultProps : function() {
												return {
													renderData : (new n)
															.get("data")
												}
											},
											renderFaqList : function() {
												var e = {};
												return
														this.props.renderData.faq
																&& this.props.renderData.faq
																		.forEach(function(
																				t,
																				a) {
																			e["faqList-"
																					+ a] = r
																					.createElement(
																							"li",
																							null,
																							r
																									.createElement(
																											"a",
																											{
																												href : t.url,
																												title : t.title,
																												target : "_blank"
																											},
																											t.title))
																		}),
														r.addons
																.createFragment(e)
											},
											render : function() {
												return r
														.createElement(
																"div",
																null,
																r
																		.createElement(
																				"span",
																				{
																					className : "icon-faq"
																				}),
																r
																		.createElement(
																				"div",
																				{
																					className : "content"
																				},
																				r
																						.createElement(
																								"h4",
																								{
																									className : "title sans-serif"
																								},
																								"常见问题FAQ"),
																				r
																						.createElement(
																								"ul",
																								{
																									className : "menu"
																								},
																								this
																										.renderFaqList())))
											}
										});
								e.exports = s
							},
							83 : function(e, t, a) {
								"use strict";
								var r = a(2), n = a(87), s = r
										.createClass({
											displayName : "Story",
											propTypes : {
												renderData : r.PropTypes.object
											},
											getDefaultProps : function() {
												return {
													renderData : (new n)
															.get("data")
												}
											},
											renderStoryList : function() {
												var e = {};
												return
														this.props.renderData.successStory
																&& this.props.renderData.successStory
																		.forEach(function(
																				t,
																				a) {
																			e["storyList-"
																					+ a] = r
																					.createElement(
																							"li",
																							null,
																							r
																									.createElement(
																											"a",
																											{
																												href : t.url,
																												title : t.title,
																												target : "_blank"
																											},
																											t.title))
																		}),
														r.addons
																.createFragment(e)
											},
											render : function() {
												return r
														.createElement(
																"div",
																null,
																r
																		.createElement(
																				"span",
																				{
																					className : "icon-story"
																				}),
																r
																		.createElement(
																				"div",
																				{
																					className : "content"
																				},
																				r
																						.createElement(
																								"h4",
																								{
																									className : "title sans-serif"
																								},
																								"成功故事"),
																				r
																						.createElement(
																								"ul",
																								{
																									className : "menu"
																								},
																								this
																										.renderStoryList())))
											}
										});
								e.exports = s
							},
							84 : function(e, t, a) {
								"use strict";
								var r = a(9), n = a(3), s = r.Model
										.extend({
											defaults : {
												param : {},
												data : {}
											},
											initialize : function() {
												this.fetch()
											},
											node : document
													.getElementById("data-banner"),
											handleError : function() {
											},
											sync : function() {
												var e = this;
												if (this.node)
													try {
														var t = JSON
																.parse(this.node.value
																		.replace(
																				/<!--.*-->/gim,
																				""));
														e
																.set(
																		"data",
																		n
																				.isFunction(e.parseData) ? e.parseData
																				.call(
																						e,
																						t)
																				: t)
													} catch (a) {
														e.handleError(a)
													}
												else
													this.handleError()
											}
										});
								e.exports = s
							},
							85 : function(e, t, a) {
								"use strict";
								var r = a(9), n = a(3), s = r.Model
										.extend({
											defaults : {
												param : {},
												data : {}
											},
											initialize : function() {
												this.fetch()
											},
											node : document
													.getElementById("data-dynamic"),
											handleError : function() {
											},
											sync : function() {
												var e = this;
												if (this.node)
													try {
														var t = JSON
																.parse(this.node.value
																		.replace(
																				/<!--.*-->/gim,
																				""));
														e
																.set(
																		"data",
																		n
																				.isFunction(e.parseData) ? e.parseData
																				.call(
																						e,
																						t)
																				: t)
													} catch (a) {
														e.handleError(a)
													}
												else
													this.handleError()
											}
										});
								e.exports = s
							},
							86 : function(e, t, a) {
								"use strict";
								var r = a(9), n = a(3), s = r.Model
										.extend({
											defaults : {
												param : {},
												data : {}
											},
											initialize : function() {
												this.fetch()
											},
											node : document
													.getElementById("data-faq"),
											handleError : function() {
											},
											sync : function() {
												var e = this;
												if (this.node)
													try {
														var t = JSON
																.parse(this.node.value
																		.replace(
																				/<!--.*-->/gim,
																				""));
														e
																.set(
																		"data",
																		n
																				.isFunction(e.parseData) ? e.parseData
																				.call(
																						e,
																						t)
																				: t)
													} catch (a) {
														e.handleError(a)
													}
												else
													this.handleError()
											}
										});
								e.exports = s
							},
							87 : function(e, t, a) {
								"use strict";
								var r = a(9), n = a(3), s = r.Model
										.extend({
											defaults : {
												param : {},
												data : {}
											},
											initialize : function() {
												this.fetch()
											},
											node : document
													.getElementById("data-story"),
											handleError : function() {
											},
											sync : function() {
												var e = this;
												if (this.node)
													try {
														var t = JSON
																.parse(this.node.value
																		.replace(
																				/<!--.*-->/gim,
																				""));
														e
																.set(
																		"data",
																		n
																				.isFunction(e.parseData) ? e.parseData
																				.call(
																						e,
																						t)
																				: t)
													} catch (a) {
														e.handleError(a)
													}
												else
													this.handleError()
											}
										});
								e.exports = s
							}
						}));