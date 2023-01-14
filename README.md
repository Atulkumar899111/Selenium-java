//Round 2 - Automation Coding Challenge Round - Assessment Assigned
This is a project for Automation Coding Challenge.
(Steps to be followed)
Steps:
1. Open https://www.amazon.in/.
Note: Clicking on the above URL may redirect you to amazon.com. Change it to amazon.in
2. Click on the hamburger menu in the top left corner.
3. Scroll down and then Click on the TV, Appliances and Electronics link under Shop by Department
section.
4. Then click on Televisions under the Tv, Audio & Cameras sub section.
5. Scroll down and filter the results by Brand ‘Samsung’.
6. Sort the Samsung results with price High to Low.
7. Click on the second highest priced item (whatever that maybe at the time of automating).
8. Switch the Window
9. Assert that “About this item” section is present and log this section text to console/report

------- Automation using selenium ------- 
//inside package utility
1. Frameworkutility - have two functions chromeSetup, findElement.
    (a). chromeSetup - to setup setup chrome and open chrome.
    (b). findElement - it returns driver.findElement(By.xpath(xpath))
//inside package configfile
2. Path - contains all the xpath 
//inside package PageObject
3. firstpage - have two functions open_the_navigation_and_select_televisions and open_amazon
4. secondPage - has one function filter_the_results_by_brand_samsung
5. nextwindow - has one function switching_to_next_window
6. Runner - to run the feature file with the help of testNg
7. Codingchallenge - feature file to write the cucumber steps

---------- To run the Automation ----------
1. Open Runner file
2. Right click in runner file.
3. Select Run As 
4. Click on TestNG Test
