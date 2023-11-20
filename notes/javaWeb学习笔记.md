javaWeb学习笔记

# 入门

![1](figs/Web流程.png)

Web中的三剑客：

![1](figs/前端三剑客的作用.png)

# Day1

HTML是一种**超文本**标记语言，可以定义文字、图片、音频、视频：

![1](figs/HTML.png)

HTML由浏览器解析，故标签都是预定义好的。

CSS是层叠样式表，用于控制页面的样式（表现）。

## 快速入门HTML

写一个HTML文件的快速步骤为：

![1](figs/HTML快速入门.png)

> VSCODE中的！后直接回车，直接生成html的基本语句。

CSS的三种引入方式：

![1](figs/三种使用CSS样式的方法.png)

设置颜色时的三种表示形式，推荐内嵌方式写在style中：

```html
<style>
    h1{
        三种颜色定义方式
        color: black;			单词
        color: rgb(1, 1, 1);	rgb表示
        color: #00f;			十六进制
    }
</style>
```

并使用**span标签**对一行的内容进行分别处理。

### 超链接

超链接使用a标签加入，可以相应的设置样式。

### 正文排版

常用的标签列出来如下：

![1](figs/HTML常用正文的排版.png)

