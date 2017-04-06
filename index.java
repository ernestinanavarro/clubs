angular.module('app', ['cfp.hotkeys', 'ngAnimate'])
	.controller('MainController', function($scope, hotkeys) {
    
    	// functions
    	$scope.active = 0;
    
		$scope.previous = function() {
            if($scope.active != 0) $scope.active -= 1;
        }    
        
    	$scope.next = function() {
            if($scope.active + 1 < $scope.forests.length) $scope.active += 1;
        }
        
    	$scope.setActive = function(i) {
            $scope.active = i;
        }
    	
    	$scope.forests = [
            {
                'rank' : 1,
            	'name' : 'Debate Club',
                'desc' : 'Enjoy having a good arguement or proving people wrong, then take part of this club. You will learn how to have an effective debate and learn how to improve on yout speaking skills. ',
                'location':'husday from 4-5:00pm in Scott's Room',
		'img' : 'http://3.bp.blogspot.com/-fcr_XPbP8_g/V8pSvMu0RjI/AAAAAAAADwk/fSI93vc4JWcOw--jiIq6JjQWf1hOokQ7wCLcB/s1600/debate.png'
        	},
            {
                'rank' : 2,
            	'name' : 'Anime Club',
                'desc' : ' SAO,Black Butler and Attack on Titan. Come and join this club to learn more and discuss about anime',
                'location':'Every other Monday from 4-5:00pm in Itow's Rm ',
		'img' : 'https://s-media-cache-ak0.pinimg.com/originals/05/c5/70/05c57019bc873a9cbe3cf7d4136f0299.jpg'
        	},
            {
                'rank' : 3,
            	'name' : 'Archery Club',
                'desc' : 'You will learn how to participate in Archery. The fundamentals of archery and how to use and care for equipment, basic safety, techniques and fundamentals of shooting but best of all have fun.'
                'location':'Tuesday and Thursday from 4-6:00 pm in the feild',
		'img' : 'http://www.roundtopswim.com/wp-content/uploads/2015/02/archerytargets1.jpg'
        	},
            {
                'rank' : 4,
            	'name' : 'Vocals 101',
                'desc' : 'Are you the one who sings along to every song on the radio. Come and learn how to become a better singer and sing with those singing lovers',
                'location':'Monday and Thursday from 8-9:00 am in Cari's rm',
		'img' : 'https://blog.oup.com/wp-content/uploads/2015/07/1260-microphone.jpg'
        	},
            {
                'rank' : 5,
            	'name' : 'Girl Code',
                'desc' : 'Here girls who have a passion for code will come together. You will work on special projects to help you learn more with using different programming launguages.',
                'location':'Every other Monday from 4:10-5:00 pm in Rm.205',
		'img' : 'https://media.licdn.com/media/p/8/005/08a/35c/274939f.png'
        	}
        ];
    
    	// hot keys
    	hotkeys.add({
            combo: 'right',
            description: 'Next slide',
            callback: function() {
              $scope.next();
            }
        });
    	hotkeys.add({
            combo: 'left',
            description: 'Previous slide',
            callback: function() {
              $scope.previous();
            }
        });
	});
