import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.17.162.51:8080/auth/login')

WebUI.setText(findTestObject('Penerimaan_Non_Konsumen/Page_Login Penerimaan/input_NPK_username'), 'halofif01')

WebUI.setEncryptedText(findTestObject('Object Repository/Penerimaan_Konsumen/Page_Login Penerimaan/input_Password_password'), 
    '94L98adiAtmdH2Pcq36NMQ==')

WebUI.click(findTestObject('Object Repository/Penerimaan_Non_Konsumen/Page_Login Penerimaan/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Penerimaan_Non_Konsumen/Page_List Penerimaan/span_Tambah Baru'))

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_List Penerimaan/span_Non Konsumen'))

WebUI.setText(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Data_pencarian_pengaduan_pelapor/input_NIK_representative_nik'), 
    '1263547184762534')

WebUI.setText(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Data_pencarian_pengaduan_pelapor/input_Nama_representative_name'), 
    'WAHIDDD')

WebUI.setText(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Data_pencarian_pengaduan_pelapor/input_No. Handphone_representative_phone'), 
    '081996734281')

WebUI.setText(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Data_pencarian_pengaduan_pelapor/input_Email_representative_email'), 
    'hidkk25@gmail.com')

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/List_kontrak_konsumen/button_Pilih'))

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/List_kontrak_konsumen/div_Terdeteksi ada case aktif di nomor kont_7f3e5f'))

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/Sub category/div_Belum ada sub category yang dipilih_uERSl9-placeholder'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/Sub category/div_Belum ada sub category yang dipilih_uERSl9-placeholder'), 
    60)

WebUI.setText(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/Sub category/input_concat(id(, , uERSl9-search, , ))_uERSl9-search'), 
    'pelaporan intensitas penagihan')

WebUI.getText(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/Sub category/li_Pelaporan Intensitas Penagihan'))

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/Sub category/li_Pelaporan Intensitas Penagihan'))

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/channel/input_Belum ada channel yang dipilih_channel_name'))

WebUI.waitForElementVisible(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/channel/input_Belum ada channel yang dipilih_channel_name'), 
    60)

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/channel/span_Email'))

WebUI.setText(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/Informasi_pengaduan/channel/textarea_Pengaduan Konsumen Minimal 400 Karakter tidak termasuk tanda baca_detail_complaint'), 
    '4. Pastikan Elemen Tidak Dinamis\nJika elemen web berubah berdasarkan interaksi atau input pengguna, pastikan Anda telah memperhitungkan faktor-faktor dinamis dalam skrip Anda. Anda mungkin perlu berinteraksi dengan elemen lain atau melakukan langkah-langkah tertentu sebelum elemen target tersedia.\n\n5. Periksa Variabel Lingkungan\nJika Anda menggunakan berbagai lingkungan pengujian (misalnya, dev, staging, prod), pastikan bahwa elemen yang Anda cari konsisten di semua lingkungan tersebut. Elemen mungkin memiliki id atau kelas yang berbeda di berbagai lingkungan.')

// Klik radio button 'KTP Konsumen'
WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/upload data/label_KTP Konsumen'))

// Unggah file untuk 'KTP Konsumen'
WebUI.uploadFile(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/upload data/Input_file'), 'C:\\Users\\SALTLTP112\\Downloads\\dokumen\\KTP_dumy.png')

// Klik radio button 'Bukti Penagihan'
WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/upload data/label_Bukti Penagihan'))

// Unggah file untuk 'Bukti Penagihan'
WebUI.uploadFile(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/upload data/Input_file_second'), 'C:\\Users\\SALTLTP112\\Downloads\\dokumen\\KTP_dumy.png')

WebUI.delay(5)

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/upload data/label_Dokumen Sudah Lengkap'))

WebUI.waitForElementClickable(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/upload data/button_Submit'), 
    10)

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/upload data/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Penerimaan_Non_Konsumen/Page_Tambah Penerimaan/upload data/button_Simpan'))

