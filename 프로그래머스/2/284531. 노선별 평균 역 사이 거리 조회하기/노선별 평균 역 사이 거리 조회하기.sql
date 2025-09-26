# 노선별로 노선, 총 누계 거리, 평균 역 사이 거리
# 노션 = route, 총 누계거리 = d_between_dist의 총합
# 평균 역 사이 거리 = d_between_dist의 평균
# 누계거리는 소수점 한자리까지, 평균은 둘째까지  (반올림이니 라운드)

SELECT
    ROUTE,
    CONCAT(ROUND(SUM(D_BETWEEN_DIST),1),'km') AS TOTAL_DISTANCE,
    CONCAT(ROUND(AVG(D_BETWEEN_DIST),2),'km') AS AVERAGE_DISTANCE
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY ROUND(SUM(D_BETWEEN_DIST),1) desc;