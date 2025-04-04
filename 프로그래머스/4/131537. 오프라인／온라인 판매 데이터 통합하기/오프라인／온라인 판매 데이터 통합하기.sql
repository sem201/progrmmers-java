-- 코드를 입력하세요
SELECT DATE_FORMAT(SALES_DATE,"%Y-%m-%d") AS SALES_DATE, PRODUCT_ID, USER_ID,SALES_AMOUNT FROM ONLINE_SALE WHERE SALES_DATE
 LIKE "2022-03%" UNION SELECT DATE_FORMAT(SALES_DATE,"%Y-%m-%d"), PRODUCT_ID, NULL AS USER_ID, SALES_AMOUNT FROM OFFLINE_SALE WHERE SALES_DATE
 LIKE "2022-03%" ORDER BY SALES_DATE,
 PRODUCT_ID, USER_ID;