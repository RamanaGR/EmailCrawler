package com.wbl.crawl;

public class GlassDoorEmails {

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.search("https://www.glassdoor.co.in/Overview/Working-at-Tata-EI_IE1064848.11,15.htm");
    }
}
//Console O/P
    /* 04:58:14 PM: Executing task 'GlassDoorEmails.main()'...

    > Task :compileJava
    > Task :processResources NO-SOURCE
    > Task :classes

    > Task :GlassDoorEmails.main()

    **Visiting** Received web page at https://www.glassdoor.co.in/index.htm
    [your.name@provider.com]

    **Visiting** Received web page at https://www.glassdoor.co.in/about/cookies.htm
    [your.name@provider.com, your.name@provider.com]

    **Visiting** Received web page at https://www.glassdoor.co.in/profile/login_input.htm?userOriginHook=HEADER_SIGNIN_LINK
    [your.name@provider.com, your.name@provider.com, your.name@provider.com]

    **Visiting** Received web page at https://www.glassdoor.co.in/employers/
    [main-banner-respond-to-reviews-UK-mobile-white@2x-375x420.png, main-banner-respond-to-reviews-UK-mobile-white@2x-750x840.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-768x640.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-1536x1280.png, main-banner-home-mobile@2x-375x420.jpg, main-banner-home-mobile@2x-750x840.jpg, main-banner-home-tabloid@2x-768x640.jpg, main-banner-home-tabloid@2x-1536x1280.jpg, your.name@provider.com, your.name@provider.com, your.name@provider.com]
    ERROR! Call crawl() before performing analysis on the document

    **Visiting** Received web page at https://www.glassdoor.co.in/post-job
    [main-banner-respond-to-reviews-UK-mobile-white@2x-375x420.png, main-banner-respond-to-reviews-UK-mobile-white@2x-750x840.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-768x640.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-1536x1280.png, main-banner-home-mobile@2x-375x420.jpg, main-banner-home-mobile@2x-750x840.jpg, main-banner-home-tabloid@2x-768x640.jpg, main-banner-home-tabloid@2x-1536x1280.jpg, your.name@provider.com, your.name@provider.com, your.name@provider.com]

    **Visiting** Received web page at https://www.glassdoor.co.uk/employers/blog/
    [main-banner-respond-to-reviews-UK-mobile-white@2x-375x420.png, main-banner-respond-to-reviews-UK-mobile-white@2x-750x840.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-768x640.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-1536x1280.png, main-banner-home-mobile@2x-375x420.jpg, main-banner-home-mobile@2x-750x840.jpg, main-banner-home-tabloid@2x-768x640.jpg, main-banner-home-tabloid@2x-1536x1280.jpg, your.name@provider.com, your.name@provider.com, your.name@provider.com]

    **Visiting** Received web page at https://www.glassdoor.co.in/employers/contact-sales/
    [main-banner-respond-to-reviews-UK-mobile-white@2x-375x420.png, main-banner-respond-to-reviews-UK-mobile-white@2x-750x840.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-768x640.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-1536x1280.png, main-banner-home-mobile@2x-375x420.jpg, main-banner-home-mobile@2x-750x840.jpg, main-banner-home-tabloid@2x-768x640.jpg, main-banner-home-tabloid@2x-1536x1280.jpg, your.name@provider.com, your.name@provider.com, your.name@provider.com]

    **Visiting** Received web page at https://www.glassdoor.co.in/about/terms.htm
    [your.name@provider.com, main-banner-respond-to-reviews-UK-mobile-white@2x-375x420.png, main-banner-respond-to-reviews-UK-mobile-white@2x-750x840.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-768x640.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-1536x1280.png, main-banner-home-mobile@2x-375x420.jpg, main-banner-home-mobile@2x-750x840.jpg, main-banner-home-tabloid@2x-768x640.jpg, main-banner-home-tabloid@2x-1536x1280.jpg, your.name@provider.com, your.name@provider.com, your.name@provider.com]

    **Visiting** Received web page at https://www.glassdoor.co.in/about/privacy.htm
    [your.name@provider.com, main-banner-respond-to-reviews-UK-mobile-white@2x-375x420.png, main-banner-respond-to-reviews-UK-mobile-white@2x-750x840.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-768x640.png, main-banner-respond-to-reviews-UK-tablet-gray@2x-1536x1280.png, main-banner-home-mobile@2x-375x420.jpg, main-banner-home-mobile@2x-750x840.jpg, main-banner-home-tabloid@2x-768x640.jpg, main-banner-home-tabloid@2x-1536x1280.jpg, your.name@provider.com, your.name@provider.com, your.name@provider.com]

    **Done** Visited 10 web page(s)

    Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
    Use '--warning-mode all' to show the individual deprecation warnings.
    See https://docs.gradle.org/6.3/userguide/command_line_interface.html#sec:command_line_warnings

    BUILD SUCCESSFUL in 30s
    2 actionable tasks: 2 executed
    04:58:44 PM: Task execution finished 'GlassDoorEmails.main()'.

    */
