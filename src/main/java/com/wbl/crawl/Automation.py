# import re
import time

from bs4 import BeautifulSoup
from selenium import webdriver
# driver = webdriver.Chrome()
# from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.keys import Keys


def scrapLinks(driver, attr):
    source_code_of_page = driver.page_source
    soup = BeautifulSoup(source_code_of_page, 'lxml')
    href_links = soup.findAll('link')
    links = []
    for tag in href_links:
        links.append(tag.get(attr))
    print(links)
    return links


class WebSiteScraping:
    """chromeOptions = Options()
    chromeOptions.add_argument("--headless")
    driver = webdriver.Chrome(r"C:\WebDrivers\chromedriver.exe",options=chromeOptions)"""

    driver = webdriver.Chrome(r"C:\WebDrivers\chromedriver.exe")
    driver.implicitly_wait(5)
    driver.get("https://www.glassdoor.co.in/index.htm")
    driver.find_element_by_class_name("locked-home-sign-in").click()
    driver.find_element_by_name("username").send_keys("ramanagangarao11@gmail.com")
    driver.find_element_by_name("password").send_keys("GANGArao@6")
    driver.find_element_by_name("submit").click()
    time.sleep(2)
    ele = driver.find_element_by_name("sc.keyword")
    ele.clear()
    ele.send_keys("Quality Engineer")
    ele.send_keys(Keys.RETURN)
    time.sleep(5)
    scrapLinks(driver, 'href')
    driver.quit()
