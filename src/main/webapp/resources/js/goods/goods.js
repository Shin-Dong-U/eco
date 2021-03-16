var goodsService=(function(){
	var isRun = false;
	
		function getGoodsList(url, search, callback){
			if(isRun === true) { return false; }
			isRun = true;
			
			$.ajax({ 
				type : 'get',						
				url : url,	
				data : search,
				contentType : "application/json; charset=utf-8",
				
				success : function(result, status, xhr){
					if(callback){
						callback(result);
					}
					isRun = false;
				}, error : function(e){
					console.log(e);
					isRun = false;
				}
			});
		}
		
		return {
			getGoodsList:getGoodsList
		};
		
	})();

function callGetGoodsList(){
	var data = $('#searchForm').serializeObject();
	var url = '/goods/rest';
	
	goodsService.getGoodsList(url, data, function(result){
		
		var linkUrl = '/goods/';
		
		var htmlStr = '';
		if(result.goodsList){
			for(var i = 0; i < result.goodsList.length; i++){
				const imgUrl = result.goodsList[i].IMG_URL ? result.goodsList[i].IMG_URL : '';//예외처리
				
				htmlStr += '<div class="col-lg-3">';
				htmlStr += '<div class="product-item">';
				htmlStr += '<div class="product-title" style="height:100px;">';
				htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '">' + result.goodsList[i].GOODS_NAME + '</a>';
				
				htmlStr += makeStarIconHtml(result.goodsList[i].STAR);
				
				htmlStr += '</div>';
				htmlStr += '<div class="product-image">';
				htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '">';
				htmlStr += '<img src="' + imgUrl + '" alt="상품 이미지" onerror="this.src=' + "'/resources/upload/img/default/no_img.jpg'" + '"/>';
				htmlStr += '</a>';
				
				htmlStr += '<div class="product-action">';
				htmlStr += '<a href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '"><i class="fa fa-search"></i></a>';
				htmlStr += '</div>';
				htmlStr += '</div>';
				
				htmlStr += '<div class="product-price">';
				htmlStr += '<h3>' + formattingComma(result.goodsList[i].PRICE) + ' &#8361;</h3>';
				htmlStr += '<a class="btn" href="' + linkUrl + result.goodsList[i].GOODS_SEQ + '"><i class="fa fa-shopping-cart"></i>구매</a>';
				htmlStr += '</div>';
				htmlStr += '</div>';
				htmlStr += '</div>';
				
			}
			
			const goodsDiv = $('#goods_list');
			goodsDiv.empty();
			goodsDiv.html(htmlStr);
		}//if(result.goodsList){
		
		if(result.page){
			const pageHtml = makePageHtml(result.page);
			
			const pageDiv = $('#pageDiv');
			$('#pageNum').val(result.page.cri.pageNum);
			$('#amount').val(result.page.cri.amount);
			pageDiv.empty();
			pageDiv.html(pageHtml);
		}
	});
}

//별점에 따라 아이콘 리턴
function makeStarIconHtml(ratting){
	var htmlText = '<div class="ratting">';
	
	for(var i = 0; i < 5; i ++){
		if(ratting < 1 && ratting >= 0.5){
			htmlText += ' <i class="fa fa-star-half-alt"></i>';
			break;
		}else if(ratting >= 1){
			htmlText += ' <i class="fa fa-star"></i>';
			ratting -= 1;
		}else{
			break;
		}
	}
	
	htmlText += '</div>';
	
	return htmlText;
}

//상품 썸네일
/*$(document).ready(function () {
    //start the carousel
    $(".carousel").carousel();

    //bind to window resize event to see if we've toggled 
    //between phone and larger
    $(window).resize(function () {
        if ($(window).width() < 768) {
          //Phone size, manipulate DOM for phone here
        } else {
          //Not phone size, re-manipulate DOM to get back to original carousel
        }
        //Re-init carousel
        $(".carousel").carousel();
    });
});*/

(function ($) {
    "use strict";
    
    // Dropdown on mouse hover
    $(document).ready(function () {
        function toggleNavbarMethod() {
            if ($(window).width() > 768) {
                $('.navbar .dropdown').on('mouseover', function () {
                    $('.dropdown-toggle', this).trigger('click');
                }).on('mouseout', function () {
                    $('.dropdown-toggle', this).trigger('click').blur();
                });
            } else {
                $('.navbar .dropdown').off('mouseover').off('mouseout');
            }
        }
        toggleNavbarMethod();
        $(window).resize(toggleNavbarMethod);
    });
    
    
    // Back to top button
    $(window).scroll(function () {
        if ($(this).scrollTop() > 100) {
            $('.back-to-top').fadeIn('slow');
        } else {
            $('.back-to-top').fadeOut('slow');
        }
    });
    $('.back-to-top').click(function () {
        $('html, body').animate({scrollTop: 0}, 1500, 'easeInOutExpo');
        return false;
    });
    
    
    // Header slider
    $('.header-slider').slick({
        autoplay: true,
        dots: true,
        infinite: true,
        slidesToShow: 1,
        slidesToScroll: 1
    });
    
    
    // Product Slider 4 Column
    $('.product-slider-4').slick({
        autoplay: true,
        infinite: true,
        dots: false,
        slidesToShow: 4,
        slidesToScroll: 1,
        responsive: [
            {
                breakpoint: 1200,
                settings: {
                    slidesToShow: 4,
                }
            },
            {
                breakpoint: 992,
                settings: {
                    slidesToShow: 3,
                }
            },
            {
                breakpoint: 768,
                settings: {
                    slidesToShow: 2,
                }
            },
            {
                breakpoint: 576,
                settings: {
                    slidesToShow: 1,
                }
            },
        ]
    });
    
    
    // Product Slider 3 Column
    $('.product-slider-3').slick({
        autoplay: true,
        infinite: true,
        dots: false,
        slidesToShow: 3,
        slidesToScroll: 1,
        responsive: [
            {
                breakpoint: 992,
                settings: {
                    slidesToShow: 3,
                }
            },
            {
                breakpoint: 768,
                settings: {
                    slidesToShow: 2,
                }
            },
            {
                breakpoint: 576,
                settings: {
                    slidesToShow: 1,
                }
            },
        ]
    });
    
    
    // Product Detail Slider
    $('.product-slider-single').slick({
        infinite: true,
        autoplay: true,
        dots: false,
        fade: true,
        slidesToShow: 1,
        slidesToScroll: 1,
        asNavFor: '.product-slider-single-nav'
    });
    $('.product-slider-single-nav').slick({
        slidesToShow: 3,
        slidesToScroll: 1,
        dots: false,
        centerMode: true,
        focusOnSelect: true,
        asNavFor: '.product-slider-single'
    });
    
    
    // Brand Slider
    $('.brand-slider').slick({
        speed: 5000,
        autoplay: true,
        autoplaySpeed: 0,
        cssEase: 'linear',
        slidesToShow: 5,
        slidesToScroll: 1,
        infinite: true,
        swipeToSlide: true,
        centerMode: true,
        focusOnSelect: false,
        arrows: false,
        dots: false,
        responsive: [
            {
                breakpoint: 992,
                settings: {
                    slidesToShow: 4,
                }
            },
            {
                breakpoint: 768,
                settings: {
                    slidesToShow: 3,
                }
            },
            {
                breakpoint: 576,
                settings: {
                    slidesToShow: 2,
                }
            },
            {
                breakpoint: 300,
                settings: {
                    slidesToShow: 1,
                }
            }
        ]
    });
    
    
    // Review slider
    $('.review-slider').slick({
        autoplay: true,
        dots: false,
        infinite: true,
        slidesToShow: 2,
        slidesToScroll: 1,
        responsive: [
            {
                breakpoint: 768,
                settings: {
                    slidesToShow: 1,
                }
            }
        ]
    });
    
    
    // Widget slider
    $('.sidebar-slider').slick({
        autoplay: true,
        dots: false,
        infinite: true,
        slidesToShow: 1,
        slidesToScroll: 1
    });
    
    
    // Quantity
    $('.qty button').on('click', function () {
        var $button = $(this);
        var oldValue = $button.parent().find('input').val();
        if ($button.hasClass('btn-plus')) {
            var newVal = parseFloat(oldValue) + 1;
        } else {
            if (oldValue > 0) {
                var newVal = parseFloat(oldValue) - 1;
            } else {
                newVal = 0;
            }
        }
        $button.parent().find('input').val(newVal);
    });
    
    
    // Shipping address show hide
    $('.checkout #shipto').change(function () {
        if($(this).is(':checked')) {
            $('.checkout .shipping-address').slideDown();
        } else {
            $('.checkout .shipping-address').slideUp();
        }
    });
    
    
    // Payment methods show hide
    $('.checkout .payment-method .custom-control-input').change(function () {
        if ($(this).prop('checked')) {
            var checkbox_id = $(this).attr('id');
            $('.checkout .payment-method .payment-content').slideUp();
            $('#' + checkbox_id + '-show').slideDown();
        }
    });
})(jQuery);




function movePage(pageNum){
	selectedPage(pageNum);
	callGetGoodsList();
}

