-- 코드를 입력하세요
SELECT A.APNT_NO, C.PT_NAME, A.PT_NO,A.MCDP_CD, B.DR_NAME, A.APNT_YMD FROM APPOINTMENT A JOIN DOCTOR B ON A.MDDR_ID = B.DR_ID JOIN PATIENT C ON C.PT_NO = A.PT_NO WHERE A.APNT_YMD LIKE '2022-04-13%' AND A.MCDP_CD = 'CS' AND A.APNT_CNCL_YN='N' ORDER BY A.APNT_YMD;

# SELECT A.APNT_NO, C.PT_NAME, A.PT_NO,A.MCDP_CD, B.DR_NAME, A.APNT_YMD,A.APNT_CNCL_YMD FROM APPOINTMENT A JOIN DOCTOR B ON A.MDDR_ID = B.DR_ID JOIN PATIENT C ON C.PT_NO = A.PT_NO WHERE A.APNT_CNCL_YMD ORDER BY A.APNT_YMD;