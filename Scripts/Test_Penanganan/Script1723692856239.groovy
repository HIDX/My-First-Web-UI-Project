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

WebUI.setText(findTestObject('Object Repository/Penanganan/Page_Login Penaganan/input_NPK_username'), '26526')

WebUI.setEncryptedText(findTestObject('Object Repository/Penanganan/Page_Login Penaganan/input_Password_password'), '94L98adiAtmdH2Pcq36NMQ==')

WebUI.click(findTestObject('Object Repository/Penanganan/Page_Login Penaganan/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/span_Daftar Tindak Lanjut'))

WebUI.setText(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/input_Status BAP_xZWSe3'), '202408040302')

WebUI.waitForElementNotClickable(findTestObject('Penanganan/Case_Verification/a_Status Temu Gabung_oFGFaf'), 5)

WebUI.click(findTestObject('Penanganan/Daftar_Tindak_Lanjut/a_Status BAP_rXoM_9'))

WebUI.click(findTestObject('Penanganan/Daftar_Tindak_Lanjut/div_Pilih Status Kontak'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/li_Berhasil Kontak'))

WebUI.waitForElementNotVisible(findTestObject('Penanganan/Daftar_Tindak_Lanjut/div_Pilih Status Detail Kontak'), 1)

WebUI.waitForElementClickable(findTestObject('Penanganan/Daftar_Tindak_Lanjut/div_Pilih Status Detail Kontak'), 1)

WebUI.click(findTestObject('Penanganan/Daftar_Tindak_Lanjut/div_Pilih Status Detail Kontak'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/li_Berhasil Bertemu'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/input_Waktu Pertemuan_g1oTk00-real'))

WebUI.click(findTestObject('Penanganan/Daftar_Tindak_Lanjut/td_15'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/input_Media Pertemuan__pgdnht601'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/label_Kantor Cabang'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/button_Unggah'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/button_Kirim'))

WebUI.click(findTestObject('Penanganan/Case_Verification/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Penanganan/Case/button_OK'))

WebUI.click(findTestObject('Object Repository/Penanganan/acak/span_Dokumen'))

WebUI.click(findTestObject('Object Repository/Penanganan/acak/span_Penanganan'))

WebUI.click(findTestObject('Object Repository/Penanganan/acak/label_Bukti Koordinasi PIC Penanganan ke Konsumen'))

WebUI.click(findTestObject('Object Repository/Penanganan/acak/button_Unggah_1'))

WebUI.click(findTestObject('Object Repository/Penanganan/acak/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Penanganan/acak/button_Submit'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/span_BAP'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/input_Informasi Peserta Pertemuan dari Peru_99b865'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/label_Perwakilan perusahaan dipilih untuk m_33d0ac'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/label_Pelapor Hadir'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/label_Sepakat'))

WebUI.setText(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/textarea_Hasil Pertemuan antara Pelapor den_2daeb3'), 
    'Hasil Pertemuan antara Pelapor dengan Perwakilan Perusahaan\nHasil Pertemuan antara Pelapor dengan Perwakilan Perusahaan\nHasil Pertemuan antara Pelapor dengan Perwakilan Perusahaan\nHasil Pertemuan antara Pelapor dengan Perwakilan Perusahaan\nHasil Pertemuan antara Pelapor dengan Perwakilan Perusahaan\nHasil Pertemuan antara Pelapor dengan Perwakilan Perusahaan\nHasil Pertemuan antara Pelapor dengan Perwakilan Perusahaan\nHasil Pertemuan antara Pelapor dengan Perwakilan Perusahaan\n')

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/button_Simpan_1_2'))

WebUI.click(findTestObject('Object Repository/Penanganan/Daftar_Tindak_Lanjut/button_Simpan_1_2_3'))

WebUI.click(findTestObject('Object Repository/Penanganan/Case/button_OK'))

WebUI.acceptAlert()

