# 專案內容介紹
本專案為java base專案  
使用tess4j套件做ocr測試  
使用的語言包為繁體中文及英文包  
來源: https://github.com/tesseract-ocr/tessdata_best  
特色: 精確度較高, 處理上較緩慢  

- 測試結果1  
繁體中文普通格式的話  
精確度相當高    
![image](https://github.com/iw5420/tess4j_test/blob/master/src/main/resources/result/result2.PNG)
  
- 測試結果2  
如果有中英混雜  
又有加上數字  
精確度將會降低  
![image](https://github.com/iw5420/tess4j_test/blob/master/src/main/resources/result/result3.PNG)
  
  
- 測試結果3 
如果有中英混雜  
又有加上數字
又加上框限的話
精確度會變得非常差    
![image](https://github.com/iw5420/tess4j_test/blob/master/src/main/resources/result/result1.PNG)
  
目前測試結果    
如果要產生報告類型OCR  
使用一般開源套件尚不可行  
