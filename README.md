# ShenmoOS · 沈秣小系统

一个真正原生的 Android App 新仓库。

定位：
- App 打开后是“模拟小手机桌面”
- 所有功能共享同一个沈秣核心与全局本地记忆
- 数据默认本地优先，外部模型只是可替换的说话器官
- 先做桌面 + 聊天 + 本地记忆骨架，再逐步接入记账、督学、语音、蓝牙小玩具、健康状态

当前版本包含：
- Kotlin + Jetpack Compose 原生骨架
- 模拟小手机桌面
- QQ式聊天页面雏形
- 本地 Room 数据库：消息、记忆、事件
- AI Gateway 模型闸门雏形
- 权限中心雏形
- GitHub Actions 云端打 debug APK
- 记账导入、督学、语音、蓝牙、健康模块入口占位

## 本地导入方式

1. 用 Android Studio 打开 ShenmoOS 文件夹
2. 等待 Gradle Sync
3. 运行 app 模块
4. MainActivity 会进入 ShenmoOS 桌面

## GitHub 云端打包方式

看 `GITHUB_BUILD.md`。
