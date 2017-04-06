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
                'img' : ''
        	},
            {
                'rank' : 2,
            	'name' : 'Anime Club',
                'desc' : '',
                'img' : ''
        	},
            {
                'rank' : 3,
            	'name' : 'Archery Club',
                'desc' : 'You will learn how to participate in Archery. The fundamentals of archery and how to use and care for equipment, basic safety, techniques and fundamentals of shooting but best of all have fun.'
                'img' : ''
        	},
            {
                'rank' : 4,
            	'name' : 'Vocals 101',
                'desc' : '',
                'img' : ''
        	},
            {
                'rank' : 5,
            	'name' : 'Girl Code',
                'desc' : 'Here girls who have a passion for code will come together. You will work on special projects to help you learn more with using different programming launguages.',
                'img' : '
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
