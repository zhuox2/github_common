# 快速生成词云
from wordcloud import WordCloud

f = open('python职业要求.txt','r').read()
wordcloud = WordCloud(background_color="white",width=1920, height=1080, margin=2,font_path=r"C:/Windows/Fonts/simfang.ttf").generate(f)

# width,height,margin可以设置图片属性

# generate 可以对全部文本进行自动分词,但是他对中文支持不好,对中文的分词处理请看我的下一篇文章
#wordcloud = WordCloud(font_path = r'D:\Fonts\simkai.ttf').generate(f)
# 你可以通过font_path参数来设置字体集

#background_color参数为设置背景颜色,默认颜色为黑色

import matplotlib.pyplot as plt
plt.imshow(wordcloud)
plt.axis("off")
plt.show()

wordcloud.to_file('test.png')
# 保存图片,但是在第三模块的例子中 图片大小将会按照 mask 保存