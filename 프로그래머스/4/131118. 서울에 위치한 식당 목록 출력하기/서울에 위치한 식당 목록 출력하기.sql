# 위치 = '서울' , '평균 리뷰 점수(세번째에서 '반올림')

SELECT
    R.REST_ID,
    R.REST_NAME,
    R.FOOD_TYPE,
    R.FAVORITES,
    R.ADDRESS,
    K.SCORE
FROM REST_INFO R JOIN
    (SELECT i.rest_id, round(avg(R.review_score),2) as SCORE
    FROM REST_INFO I JOIN REST_REVIEW R
    ON I.REST_ID = R.REST_ID
    WHERE I.ADDRESS LIKE '서울%'
    group by i.rest_id) K
ON R.REST_ID = K.REST_ID
ORDER BY K.SCORE DESC, R.FAVORITES DESC