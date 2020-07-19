/**
 * 
 */

function openNav() {
	//debugger;

	if ($("#main").hasClass("mainDiv")) {
		/* Collapse left navigation */
		$("#main").removeClass("mainDiv");
		$("#mySidenav").removeClass("sidenav-show");

		$("#main").addClass("mainDiv-full");
		$("#mySidenav").addClass("sidenav-hidden");

		$("#navCollapse").attr("src", "img/Expand.png");
		$("#navCollapse").attr("title", "Expand left navigation");
	} else {
		/* Expand left navigation */
		$("#main").removeClass("mainDiv-full");
		$("#mySidenav").removeClass("sidenav-hidden");

		$("#main").addClass("mainDiv");
		$("#mySidenav").addClass("sidenav-show");

		$("#navCollapse").attr("src", "img/Collapse.png");
		$("#navCollapse").attr("title", "Collapse left navigation");

	}

}
