package github.com.taconaut.plugin.webservice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.configuration.ConfigurationException;

import net.pms.PMS;
import net.pms.configuration.PmsConfiguration;

/**
 * Exposes methods to get and set UMS configuration values.
 */
@WebService(serviceName = "Configure", targetNamespace = "http://universalmediaserver.com/configure")
public class ConfigurationWebService extends WebServiceBase {
	private static final PmsConfiguration CONFIG = PMS.getConfiguration();

	@WebMethod()
	public String getDefaultLogFileFolder() {
		return CONFIG.getDefaultLogFileFolder();
	}

	@WebMethod()
	public String getDefaultLogFileName() {
		return CONFIG.getDefaultLogFileName();
	}

	@WebMethod()
	public String getDefaultLogFilePath() {
		return CONFIG.getDefaultLogFilePath();
	}

	@WebMethod()
	public String getTempFolder() {
		try {
			return CONFIG.getTempFolder().getAbsolutePath();
		} catch (IOException e) {
			return null;
		}
	}

	@WebMethod()
	public String getVlcPath() {
		return CONFIG.getVlcPath();
	}

	@WebMethod()
	public String getMencoderPath() {
		return CONFIG.getMencoderPath();
	}

	@WebMethod()
	public int getMencoderMaxThreads() {
		return CONFIG.getMencoderMaxThreads();
	}

	@WebMethod()
	public String getDCRawPath() {
		return CONFIG.getDCRawPath();
	}

	@WebMethod()
	public String getFfmpegPath() {
		return CONFIG.getFfmpegPath();
	}

	@WebMethod()
	public String getMplayerPath() {
		return CONFIG.getMplayerPath();
	}

	@WebMethod()
	public String getTsmuxerPath() {
		return CONFIG.getTsmuxerPath();
	}

	@WebMethod()
	public String getTsmuxerNewPath() {
		return CONFIG.getTsmuxerNewPath();
	}

	@WebMethod()
	public String getFlacPath() {
		return CONFIG.getFlacPath();
	}

	@WebMethod()
	public String getInterFramePath() {
		return CONFIG.getInterFramePath();
	}

	@WebMethod()
	public boolean isTsmuxerForceFps() {
		return CONFIG.isTsmuxerForceFps();
	}

	@WebMethod()
	public int getAudioBitrate() {
		return CONFIG.getAudioBitrate();
	}

	@WebMethod()
	public void setTsmuxerForceFps(@WebParam(name = "value") boolean value) {
		CONFIG.setTsmuxerForceFps(value);
	}

	@WebMethod()
	public int getServerPort() {
		return CONFIG.getServerPort();
	}

	@WebMethod()
	public void setServerPort(@WebParam(name = "value") int value) {
		CONFIG.setServerPort(value);
	}

	@WebMethod()
	public String getServerHostname() {
		return CONFIG.getServerHostname();
	}

	@WebMethod()
	public void setHostname(@WebParam(name = "value") String value) {
		CONFIG.setHostname(value);
	}

	@WebMethod()
	public String getServerName() {
		return CONFIG.getServerName();
	}

	@WebMethod()
	public void setServerName(@WebParam(name = "value") String value) {
		CONFIG.setServerName(value);
	}

	@WebMethod()
	public int getProxyServerPort() {
		return CONFIG.getProxyServerPort();
	}

	// @WebMethod()
	// public Locale getLanguageLocale() {
	// return CONFIG.getLanguageLocale();
	// }

	@WebMethod()
	public String getLanguageTag() {
		return CONFIG.getLanguageTag();
	}

	@WebMethod()
	public String getLanguage() {
		return CONFIG.getLanguage();
	}

	// @WebMethod()
	// public void setLanguage(@WebParam(name = "value") Locale value) {
	// CONFIG.setLanguage(value);
	// }

	@WebMethod()
	public void setLanguage(@WebParam(name = "value") String value) {
		CONFIG.setLanguage(value);
	}

	@WebMethod()
	public int getMinMemoryBufferSize() {
		return CONFIG.getMinMemoryBufferSize();
	}

	@WebMethod()
	public int getMaxMemoryBufferSize() {
		return CONFIG.getMaxMemoryBufferSize();
	}

	@WebMethod()
	public void setMaxMemoryBufferSize(@WebParam(name = "value") int value) {
		CONFIG.setMaxMemoryBufferSize(value);
	}

	@WebMethod()
	public String getAssScale() {
		return CONFIG.getAssScale();
	}

	@WebMethod()
	public boolean isMencoderAc3Fixed() {
		return CONFIG.isMencoderAc3Fixed();
	}

	@WebMethod()
	public String getAssMargin() {
		return CONFIG.getAssMargin();
	}

	@WebMethod()
	public String getAssOutline() {
		return CONFIG.getAssOutline();
	}

	@WebMethod()
	public String getAssShadow() {
		return CONFIG.getAssShadow();
	}

	@WebMethod()
	public String getMencoderNoAssScale() {
		return CONFIG.getMencoderNoAssScale();
	}

	@WebMethod()
	public String getMencoderNoAssSubPos() {
		return CONFIG.getMencoderNoAssSubPos();
	}

	@WebMethod()
	public String getMencoderNoAssBlur() {
		return CONFIG.getMencoderNoAssBlur();
	}

	@WebMethod()
	public String getMencoderNoAssOutline() {
		return CONFIG.getMencoderNoAssOutline();
	}

	@WebMethod()
	public void setMencoderNoAssOutline(@WebParam(name = "value") String value) {
		CONFIG.setMencoderNoAssOutline(value);
	}

	@WebMethod()
	public void setMencoderAc3Fixed(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderAc3Fixed(value);
	}

	@WebMethod()
	public void setAssMargin(@WebParam(name = "value") String value) {
		CONFIG.setAssMargin(value);
	}

	@WebMethod()
	public void setAssOutline(@WebParam(name = "value") String value) {
		CONFIG.setAssOutline(value);
	}

	@WebMethod()
	public void setAssShadow(@WebParam(name = "value") String value) {
		CONFIG.setAssShadow(value);
	}

	@WebMethod()
	public void setAssScale(@WebParam(name = "value") String value) {
		CONFIG.setAssScale(value);
	}

	@WebMethod()
	public void setMencoderNoAssScale(@WebParam(name = "value") String value) {
		CONFIG.setMencoderNoAssScale(value);
	}

	@WebMethod()
	public void setMencoderNoAssBlur(@WebParam(name = "value") String value) {
		CONFIG.setMencoderNoAssBlur(value);
	}

	@WebMethod()
	public void setMencoderNoAssSubPos(@WebParam(name = "value") String value) {
		CONFIG.setMencoderNoAssSubPos(value);
	}

	@WebMethod()
	public void setMencoderMaxThreads(@WebParam(name = "value") int value) {
		CONFIG.setMencoderMaxThreads(value);
	}

	@WebMethod()
	public int getThumbnailSeekPos() {
		return CONFIG.getThumbnailSeekPos();
	}

	@WebMethod()
	public void setThumbnailSeekPos(@WebParam(name = "value") int value) {
		CONFIG.setThumbnailSeekPos(value);
	}

	@WebMethod()
	public boolean isMencoderAss() {
		return CONFIG.isMencoderAss();
	}

	@WebMethod()
	public boolean isDisableSubtitles() {
		return CONFIG.isDisableSubtitles();
	}

	@WebMethod()
	public void setDisableSubtitles(@WebParam(name = "value") boolean value) {
		CONFIG.setDisableSubtitles(value);
	}

	@WebMethod()
	public boolean isAudioUsePCM() {
		return CONFIG.isAudioUsePCM();
	}

	@WebMethod()
	public boolean isMencoderUsePcmForHQAudioOnly() {
		return CONFIG.isMencoderUsePcmForHQAudioOnly();
	}

	@WebMethod()
	public String getFont() {
		return CONFIG.getFont();
	}

	@WebMethod()
	public String getAudioLanguages() {
		return CONFIG.getAudioLanguages();
	}

	@WebMethod()
	public String getSubtitlesLanguages() {
		return CONFIG.getSubtitlesLanguages();
	}

	@WebMethod()
	public String getForcedSubtitleLanguage() {
		return CONFIG.getForcedSubtitleLanguage();
	}

	@WebMethod()
	public String getForcedSubtitleTags() {
		return CONFIG.getForcedSubtitleTags();
	}

	@WebMethod()
	public String getAudioSubLanguages() {
		return CONFIG.getAudioSubLanguages();
	}

	@WebMethod()
	public void setAudioSubLanguages(@WebParam(name = "value") String value) {
		CONFIG.setAudioSubLanguages(value);
	}

	@WebMethod()
	public boolean isMencoderSubFribidi() {
		return CONFIG.isMencoderSubFribidi();
	}

	@WebMethod()
	public String getSubtitlesCodepage() {
		return CONFIG.getSubtitlesCodepage();
	}

	@WebMethod()
	public boolean isMencoderFontConfig() {
		return CONFIG.isMencoderFontConfig();
	}

	@WebMethod()
	public void setMencoderForceFps(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderForceFps(value);
	}

	@WebMethod()
	public boolean isMencoderForceFps() {
		return CONFIG.isMencoderForceFps();
	}

	@WebMethod()
	public void setAudioLanguages(@WebParam(name = "value") String value) {
		CONFIG.setAudioLanguages(value);
	}

	@WebMethod()
	public void setSubtitlesLanguages(@WebParam(name = "value") String value) {
		CONFIG.setSubtitlesLanguages(value);
	}

	@WebMethod()
	public void setForcedSubtitleLanguage(@WebParam(name = "value") String value) {
		CONFIG.setForcedSubtitleLanguage(value);
	}

	@WebMethod()
	public void setForcedSubtitleTags(@WebParam(name = "value") String value) {
		CONFIG.setForcedSubtitleTags(value);
	}

	@WebMethod()
	public String getMencoderCustomOptions() {
		return CONFIG.getMencoderCustomOptions();
	}

	@WebMethod()
	public void setMencoderCustomOptions(String value) {
		CONFIG.setMencoderCustomOptions(value);
	}

	@WebMethod()
	public void setSubtitlesCodepage(String value) {
		CONFIG.setSubtitlesCodepage(value);
	}

	@WebMethod()
	public void setMencoderSubFribidi(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderSubFribidi(value);
	}

	@WebMethod()
	public void setFont(@WebParam(name = "value") String value) {
		CONFIG.setFont(value);
	}

	@WebMethod()
	public void setMencoderAss(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderAss(value);
	}

	@WebMethod()
	public void setMencoderFontConfig(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderFontConfig(value);
	}

	@WebMethod()
	public void setAudioUsePCM(@WebParam(name = "value") boolean value) {
		CONFIG.setAudioUsePCM(value);
	}

	@WebMethod()
	public void setMencoderUsePcmForHQAudioOnly(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderUsePcmForHQAudioOnly(value);
	}

	@WebMethod()
	public boolean isArchiveBrowsing() {
		return CONFIG.isArchiveBrowsing();
	}

	@WebMethod()
	public void setArchiveBrowsing(@WebParam(name = "value") boolean value) {
		CONFIG.setArchiveBrowsing(value);
	}

	@WebMethod()
	public boolean isMencoderYadif() {
		return CONFIG.isMencoderYadif();
	}

	@WebMethod()
	public void setMencoderYadif(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderYadif(value);
	}

	@WebMethod()
	public boolean isMencoderScaler() {
		return CONFIG.isMencoderScaler();
	}

	@WebMethod()
	public void setMencoderScaler(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderScaler(value);
	}

	@WebMethod()
	public int getMencoderScaleX() {
		return CONFIG.getMencoderScaleX();
	}

	@WebMethod()
	public void setMencoderScaleX(@WebParam(name = "value") int value) {
		CONFIG.setMencoderScaleX(value);
	}

	@WebMethod()
	public int getMencoderScaleY() {
		return CONFIG.getMencoderScaleY();
	}

	@WebMethod()
	public void setMencoderScaleY(@WebParam(name = "value") int value) {
		CONFIG.setMencoderScaleY(value);
	}

	@WebMethod()
	public int getAudioChannelCount() {
		return CONFIG.getAudioChannelCount();
	}

	@WebMethod()
	public void setAudioChannelCount(@WebParam(name = "value") int value) {
		CONFIG.setAudioChannelCount(value);
	}

	@WebMethod()
	public void setAudioBitrate(@WebParam(name = "value") int value) {
		CONFIG.setAudioBitrate(value);
	}

	@WebMethod()
	public String getMaximumBitrate() {
		return CONFIG.getMaximumBitrate();
	}

	@WebMethod()
	public String getMaximumBitrateDisplay() {
		return CONFIG.getMaximumBitrateDisplay();
	}

	@WebMethod()
	public void setMaximumBitrate(String value) {
		CONFIG.setMaximumBitrate(value);
	}

	@WebMethod()
	public List<String> getSelectedRenderers() {
		return CONFIG.getSelectedRenderers();
	}

	@WebMethod()
	public void setSelectedRenderersValue(String value) {
		CONFIG.setSelectedRenderers(value);
	}

	@WebMethod()
	public void setSelectedRenderersList(List<String> value) {
		CONFIG.setSelectedRenderers(value);
	}

	@WebMethod()
	public boolean isThumbnailGenerationEnabled() {
		return CONFIG.isThumbnailGenerationEnabled();
	}

	@WebMethod()
	public void setThumbnailGenerationEnabled(@WebParam(name = "value") boolean value) {
		CONFIG.setThumbnailGenerationEnabled(value);
	}

	@WebMethod()
	public boolean getImageThumbnailsEnabled() {
		return CONFIG.getImageThumbnailsEnabled();
	}

	@WebMethod()
	public void setImageThumbnailsEnabled(@WebParam(name = "value") boolean value) {
		CONFIG.setImageThumbnailsEnabled(value);
	}

	@WebMethod()
	public int getNumberOfCpuCores() {
		return CONFIG.getNumberOfCpuCores();
	}

	@WebMethod()
	public void setNumberOfCpuCores(@WebParam(name = "value") int value) {
		CONFIG.setNumberOfCpuCores(value);
	}

	@WebMethod()
	public boolean isMinimized() {
		return CONFIG.isMinimized();
	}

	@WebMethod()
	public void setMinimized(@WebParam(name = "value") boolean value) {
		CONFIG.setMinimized(value);
	}

	@WebMethod()
	public boolean isAutoStart() {
		return CONFIG.isAutoStart();
	}

	@WebMethod()
	public void setAutoStart(@WebParam(name = "value") boolean value) {
		CONFIG.setAutoStart(value);
	}

	@WebMethod()
	public boolean isAutoloadExternalSubtitles() {
		return CONFIG.isAutoloadExternalSubtitles();
	}

	@WebMethod()
	public void setAutoloadExternalSubtitles(@WebParam(name = "value") boolean value) {
		CONFIG.setAutoloadExternalSubtitles(value);
	}

	@WebMethod()
	public boolean isForceExternalSubtitles() {
		return CONFIG.isForceExternalSubtitles();
	}

	@WebMethod()
	public void setForceExternalSubtitles(@WebParam(name = "value") boolean value) {
		CONFIG.setForceExternalSubtitles(value);
	}

	@WebMethod()
	public boolean getHideVideoSettings() {
		return CONFIG.getHideVideoSettings();
	}

	@WebMethod()
	public void setHideVideoSettings(@WebParam(name = "value") boolean value) {
		CONFIG.setHideVideoSettings(value);
	}

	@WebMethod()
	public boolean getUseCache() {
		return CONFIG.getUseCache();
	}

	@WebMethod()
	public void setUseCache(@WebParam(name = "value") boolean value) {
		CONFIG.setUseCache(value);
	}

	@WebMethod()
	public void setAvisynthConvertFps(@WebParam(name = "value") boolean value) {
		CONFIG.setAvisynthConvertFps(value);
	}

	@WebMethod()
	public boolean getAvisynthConvertFps() {
		return CONFIG.getAvisynthConvertFps();
	}

	@WebMethod()
	public void setAvisynthInterFrame(@WebParam(name = "value") boolean value) {
		CONFIG.setAvisynthInterFrame(value);
	}

	@WebMethod()
	public boolean getAvisynthInterFrame() {
		return CONFIG.getAvisynthInterFrame();
	}

	@WebMethod()
	public void setAvisynthInterFrameGPU(@WebParam(name = "value") boolean value) {
		CONFIG.setAvisynthInterFrameGPU(value);
	}

	@WebMethod()
	public boolean getAvisynthInterFrameGPU() {
		return CONFIG.getAvisynthInterFrameGPU();
	}

	@WebMethod()
	public void setAvisynthMultiThreading(@WebParam(name = "value") boolean value) {
		CONFIG.setAvisynthMultiThreading(value);
	}

	@WebMethod()
	public boolean getAvisynthMultiThreading() {
		return CONFIG.getAvisynthMultiThreading();
	}

	@WebMethod()
	public String getAvisynthScript() {
		return CONFIG.getAvisynthScript();
	}

	@WebMethod()
	public void setAvisynthScript(String value) {
		CONFIG.setAvisynthScript(value);
	}

	@WebMethod()
	public String getMencoderCodecSpecificConfig() {
		return CONFIG.getMencoderCodecSpecificConfig();
	}

	@WebMethod()
	public void setMencoderCodecSpecificConfig(@WebParam(name = "value") String value) {
		CONFIG.setMencoderCodecSpecificConfig(value);
	}

	@WebMethod()
	public int getMaxAudioBuffer() {
		return CONFIG.getMaxAudioBuffer();
	}

	@WebMethod()
	public int getMinStreamBuffer() {
		return CONFIG.getMinStreamBuffer();
	}

	@WebMethod()
	public String getMPEG2MainSettingsFFmpeg() {
		return CONFIG.getMPEG2MainSettingsFFmpeg();
	}

	@WebMethod()
	public void setFfmpegMultithreading(@WebParam(name = "value") boolean value) {
		CONFIG.setFfmpegMultithreading(value);
	}

	@WebMethod()
	public boolean isFfmpegMultithreading() {
		return CONFIG.isFfmpegMultithreading();
	}

	@WebMethod()
	public void setFfmpegAviSynthMultithreading(@WebParam(name = "value") boolean value) {
		CONFIG.setFfmpegAviSynthMultithreading(value);
	}

	@WebMethod()
	public boolean isFfmpegAviSynthMultithreading() {
		return CONFIG.isFfmpegAviSynthMultithreading();
	}

	@WebMethod()
	public void setFfmpegAvisynthConvertFps(@WebParam(name = "value") boolean value) {
		CONFIG.setFfmpegAvisynthConvertFps(value);
	}

	@WebMethod()
	public boolean getFfmpegAvisynthConvertFps() {
		return CONFIG.getFfmpegAvisynthConvertFps();
	}

	@WebMethod()
	public void setFfmpegAvisynthInterFrame(@WebParam(name = "value") boolean value) {
		CONFIG.setFfmpegAvisynthInterFrame(value);
	}

	@WebMethod()
	public boolean getFfmpegAvisynthInterFrame() {
		return CONFIG.getFfmpegAvisynthInterFrame();
	}

	@WebMethod()
	public void setFfmpegAvisynthInterFrameGPU(@WebParam(name = "value") boolean value) {
		CONFIG.setFfmpegAvisynthInterFrameGPU(value);
	}

	@WebMethod()
	public boolean getFfmpegAvisynthInterFrameGPU() {
		return CONFIG.getFfmpegAvisynthInterFrameGPU();
	}

	@WebMethod()
	public boolean isMencoderNoOutOfSync() {
		return CONFIG.isMencoderNoOutOfSync();
	}

	@WebMethod()
	public void setMencoderNoOutOfSync(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderNoOutOfSync(value);
	}

	@WebMethod()
	public boolean getTrancodeBlocksMultipleConnections() {
		return CONFIG.getTrancodeBlocksMultipleConnections();
	}

	@WebMethod()
	public void setTranscodeBlocksMultipleConnections(@WebParam(name = "value") boolean value) {
		CONFIG.setTranscodeBlocksMultipleConnections(value);
	}

	@WebMethod()
	public boolean getTrancodeKeepFirstConnections() {
		return CONFIG.getTrancodeKeepFirstConnections();
	}

	@WebMethod()
	public void setTrancodeKeepFirstConnections(@WebParam(name = "value") boolean value) {
		CONFIG.setTrancodeKeepFirstConnections(value);
	}

	@WebMethod()
	public boolean isMencoderIntelligentSync() {
		return CONFIG.isMencoderIntelligentSync();
	}

	@WebMethod()
	public void setMencoderIntelligentSync(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderIntelligentSync(value);
	}

	@WebMethod()
	public String getFfmpegAlternativePath() {
		return CONFIG.getFfmpegAlternativePath();
	}

	@WebMethod()
	public void setFfmpegAlternativePath(@WebParam(name = "value") String value) {
		CONFIG.setFfmpegAlternativePath(value);
	}

	@WebMethod()
	public boolean getSkipLoopFilterEnabled() {
		return CONFIG.getSkipLoopFilterEnabled();
	}

	@WebMethod()
	public List<String> getSkipNetworkInterfaces() {
		return CONFIG.getSkipNetworkInterfaces();
	}

	@WebMethod()
	public void setSkipLoopFilterEnabled(@WebParam(name = "value") boolean value) {
		CONFIG.setSkipLoopFilterEnabled(value);
	}

	@WebMethod()
	public String getMPEG2MainSettings() {
		return CONFIG.getMPEG2MainSettings();
	}

	@WebMethod()
	public void setMPEG2MainSettings(@WebParam(name = "value") String value) {
		CONFIG.setMPEG2MainSettings(value);
	}

	@WebMethod()
	public String getx264ConstantRateFactor() {
		return CONFIG.getx264ConstantRateFactor();
	}

	@WebMethod()
	public void setx264ConstantRateFactor(@WebParam(name = "value") String value) {
		CONFIG.setx264ConstantRateFactor(value);
	}

	@WebMethod()
	public String getMencoderVobsubSubtitleQuality() {
		return CONFIG.getMencoderVobsubSubtitleQuality();
	}

	@WebMethod()
	public void setMencoderVobsubSubtitleQuality(@WebParam(name = "value") String value) {
		CONFIG.setMencoderVobsubSubtitleQuality(value);
	}

	@WebMethod()
	public String getMencoderOverscanCompensationWidth() {
		return CONFIG.getMencoderOverscanCompensationWidth();
	}

	@WebMethod()
	public void setMencoderOverscanCompensationWidth(@WebParam(name = "value") String value) {
		CONFIG.setMencoderOverscanCompensationWidth(value);
	}

	@WebMethod()
	public String getMencoderOverscanCompensationHeight() {
		return CONFIG.getMencoderOverscanCompensationHeight();
	}

	@WebMethod()
	public void setMencoderOverscanCompensationHeight(@WebParam(name = "value") String value) {
		CONFIG.setMencoderOverscanCompensationHeight(value);
	}

	@WebMethod()
	public void setEnginesAsList(@WebParam(name = "enginesAsList") ArrayList<String> enginesAsList) {
		CONFIG.setEnginesAsList(enginesAsList);
	}

	@WebMethod()
	public List<String> getEnginesAsList() {
		return CONFIG.getEnginesAsList(net.pms.PMS.get().getRegistry());
	}

	@WebMethod()
	public void save() throws ConfigurationException {
		CONFIG.save();
	}

	@WebMethod()
	public String getFolders(@WebParam(name = "tags") ArrayList<String> tags) {
		return CONFIG.getFolders(tags);
	}

	@WebMethod()
	public String getFoldersIgnored(@WebParam(name = "tags") ArrayList<String> tags) {
		return CONFIG.getFoldersIgnored(tags);
	}

	@WebMethod()
	public void setFolders(@WebParam(name = "value") String value) {
		CONFIG.setFolders(value);
	}

	@WebMethod()
	public String getFoldersMonitored() {
		return CONFIG.getFoldersMonitored();
	}

	@WebMethod()
	public void setFoldersMonitored(@WebParam(name = "value") String value) {
		CONFIG.setFoldersMonitored(value);
	}

	@WebMethod()
	public String getNetworkInterface() {
		return CONFIG.getNetworkInterface();
	}

	@WebMethod()
	public void setNetworkInterface(@WebParam(name = "value") String value) {
		CONFIG.setNetworkInterface(value);
	}

	@WebMethod()
	public boolean isHideEngineNames() {
		return CONFIG.isHideEngineNames();
	}

	@WebMethod()
	public void setHideEngineNames(@WebParam(name = "value") boolean value) {
		CONFIG.setHideEngineNames(value);
	}

	@WebMethod()
	public boolean isHideExtensions() {
		return CONFIG.isHideExtensions();
	}

	@WebMethod()
	public void setHideExtensions(@WebParam(name = "value") boolean value) {
		CONFIG.setHideExtensions(value);
	}

	@WebMethod()
	public String getShares() {
		return CONFIG.getShares();
	}

	@WebMethod()
	public void setShares(@WebParam(name = "value") String value) {
		CONFIG.setShares(value);
	}

	@WebMethod()
	public String getDisableTranscodeForExtensions() {
		return CONFIG.getDisableTranscodeForExtensions();
	}

	@WebMethod()
	public void setDisableTranscodeForExtensions(@WebParam(name = "value") String value) {
		CONFIG.setDisableTranscodeForExtensions(value);
	}

	@WebMethod()
	public String getForceTranscodeForExtensions() {
		return CONFIG.getForceTranscodeForExtensions();
	}

	@WebMethod()
	public void setForceTranscodeForExtensions(@WebParam(name = "value") String value) {
		CONFIG.setForceTranscodeForExtensions(value);
	}

	@WebMethod()
	public void setMencoderMT(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderMT(value);
	}

	@WebMethod()
	public boolean getMencoderMT() {
		return CONFIG.getMencoderMT();
	}

	@WebMethod()
	public void setAudioRemuxAC3(@WebParam(name = "value") boolean value) {
		CONFIG.setAudioRemuxAC3(value);
	}

	@WebMethod()
	public boolean isAudioRemuxAC3() {
		return CONFIG.isAudioRemuxAC3();
	}

	@WebMethod()
	public void setMencoderRemuxMPEG2(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderRemuxMPEG2(value);
	}

	@WebMethod()
	public boolean isMencoderRemuxMPEG2() {
		return CONFIG.isMencoderRemuxMPEG2();
	}

	@WebMethod()
	public void setDisableFakeSize(@WebParam(name = "value") boolean value) {
		CONFIG.setDisableFakeSize(value);
	}

	@WebMethod()
	public boolean isDisableFakeSize() {
		return CONFIG.isDisableFakeSize();
	}

	@WebMethod()
	public void setMencoderAssDefaultStyle(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderAssDefaultStyle(value);
	}

	@WebMethod()
	public boolean isMencoderAssDefaultStyle() {
		return CONFIG.isMencoderAssDefaultStyle();
	}

	@WebMethod()
	public void setUseEmbeddedSubtitlesStyle(@WebParam(name = "value") boolean value) {
		CONFIG.setUseEmbeddedSubtitlesStyle(value);
	}

	@WebMethod()
	public boolean isUseEmbeddedSubtitlesStyle() {
		return CONFIG.isUseEmbeddedSubtitlesStyle();
	}

	@WebMethod()
	public int getMEncoderOverscan() {
		return CONFIG.getMEncoderOverscan();
	}

	@WebMethod()
	public void setMEncoderOverscan(@WebParam(name = "value") int value) {
		CONFIG.setMEncoderOverscan(value);
	}

	@WebMethod()
	public void setSortMethod(@WebParam(name = "value") int value) {
		CONFIG.setSortMethod(value);
	}

	@WebMethod()
	public int getAudioThumbnailMethod() {
		return CONFIG.getAudioThumbnailMethod();
	}

	@WebMethod()
	public void setAudioThumbnailMethod(@WebParam(name = "value") int value) {
		CONFIG.setAudioThumbnailMethod(value);
	}

	@WebMethod()
	public String getAlternateThumbFolder() {
		return CONFIG.getAlternateThumbFolder();
	}

	@WebMethod()
	public void setAlternateThumbFolder(@WebParam(name = "value") String value) {
		CONFIG.setAlternateThumbFolder(value);
	}

	@WebMethod()
	public String getAlternateSubtitlesFolder() {
		return CONFIG.getAlternateSubtitlesFolder();
	}

	@WebMethod()
	public void setAlternateSubtitlesFolder(@WebParam(name = "value") String value) {
		CONFIG.setAlternateSubtitlesFolder(value);
	}

	@WebMethod()
	public void setAudioEmbedDtsInPcm(@WebParam(name = "value") boolean value) {
		CONFIG.setAudioEmbedDtsInPcm(value);
	}

	@WebMethod()
	public boolean isAudioEmbedDtsInPcm() {
		return CONFIG.isAudioEmbedDtsInPcm();
	}

	@WebMethod()
	public void setEncodedAudioPassthrough(@WebParam(name = "value") boolean value) {
		CONFIG.setEncodedAudioPassthrough(value);
	}

	@WebMethod()
	public boolean isEncodedAudioPassthrough() {
		return CONFIG.isEncodedAudioPassthrough();
	}

	@WebMethod()
	public void setMencoderMuxWhenCompatible(@WebParam(name = "value") boolean value) {
		CONFIG.setMencoderMuxWhenCompatible(value);
	}

	@WebMethod()
	public boolean isMencoderMuxWhenCompatible() {
		return CONFIG.isMencoderMuxWhenCompatible();
	}

	@WebMethod()
	public void setMEncoderNormalizeVolume(@WebParam(name = "value") boolean value) {
		CONFIG.setMEncoderNormalizeVolume(value);
	}

	@WebMethod()
	public boolean isMEncoderNormalizeVolume() {
		return CONFIG.isMEncoderNormalizeVolume();
	}

	@WebMethod()
	public void setFFmpegMuxWithTsMuxerWhenCompatible(@WebParam(name = "value") boolean value) {
		CONFIG.setFFmpegMuxWithTsMuxerWhenCompatible(value);
	}

	@WebMethod()
	public boolean isFFmpegMuxWithTsMuxerWhenCompatible() {
		return CONFIG.isFFmpegMuxWithTsMuxerWhenCompatible();
	}

	@WebMethod()
	public void setFFmpegDeferToMEncoderForSubtitles(@WebParam(name = "value") boolean value) {
		CONFIG.setFFmpegDeferToMEncoderForSubtitles(value);
	}

	@WebMethod()
	public boolean isFFmpegDeferToMEncoderForSubtitles() {
		return isFFmpegDeferToMEncoderForProblematicSubtitles();
	}

	@WebMethod()
	public void setFFmpegDeferToMEncoderForProblematicSubtitles(@WebParam(name = "value") boolean value) {
		CONFIG.setFFmpegDeferToMEncoderForProblematicSubtitles(value);
	}

	@WebMethod()
	public boolean isFFmpegDeferToMEncoderForProblematicSubtitles() {
		return CONFIG.isFFmpegDeferToMEncoderForProblematicSubtitles();
	}

	@WebMethod()
	public void setFFmpegFontConfig(@WebParam(name = "value") boolean value) {
		CONFIG.setFFmpegFontConfig(value);
	}

	@WebMethod()
	public boolean isFFmpegFontConfig() {
		return CONFIG.isFFmpegFontConfig();
	}

	@WebMethod()
	public void setMuxAllAudioTracks(@WebParam(name = "value") boolean value) {
		CONFIG.setMuxAllAudioTracks(value);
	}

	@WebMethod()
	public boolean isMuxAllAudioTracks() {
		return CONFIG.isMuxAllAudioTracks();
	}

	@WebMethod()
	public void setUseMplayerForVideoThumbs(@WebParam(name = "value") boolean value) {
		CONFIG.setUseMplayerForVideoThumbs(value);
	}

	@WebMethod()
	public boolean isUseMplayerForVideoThumbs() {
		return CONFIG.isUseMplayerForVideoThumbs();
	}

	@WebMethod()
	public String getIpFilter() {
		return CONFIG.getIpFilter();
	}

	// @WebMethod()
	// public IpFilter getIpFiltering() {
	// return CONFIG.getIpFiltering();
	// }

	@WebMethod()
	public void setIpFilter(@WebParam(name = "value") String value) {
		CONFIG.setIpFilter(value);
	}

	@WebMethod()
	public void setPreventsSleep(@WebParam(name = "value") boolean value) {
		CONFIG.setPreventsSleep(value);
	}

	@WebMethod()
	public boolean isPreventsSleep() {
		return CONFIG.isPreventsSleep();
	}

	@WebMethod()
	public void setHTTPEngineV2(@WebParam(name = "value") boolean value) {
		CONFIG.setHTTPEngineV2(value);
	}

	@WebMethod()
	public boolean isHTTPEngineV2() {
		return CONFIG.isHTTPEngineV2();
	}

	@WebMethod()
	public boolean isShowIphotoLibrary() {
		return CONFIG.isShowIphotoLibrary();
	}

	@WebMethod()
	public void setShowIphotoLibrary(@WebParam(name = "value") boolean value) {
		CONFIG.setShowIphotoLibrary(value);
	}

	@WebMethod()
	public boolean isShowApertureLibrary() {
		return CONFIG.isShowApertureLibrary();
	}

	@WebMethod()
	public void setShowApertureLibrary(@WebParam(name = "value") boolean value) {
		CONFIG.setShowApertureLibrary(value);
	}

	@WebMethod()
	public boolean isShowItunesLibrary() {
		return CONFIG.isShowItunesLibrary();
	}

	@WebMethod()
	public String getItunesLibraryPath() {
		return CONFIG.getItunesLibraryPath();
	}

	@WebMethod()
	public void setShowItunesLibrary(@WebParam(name = "value") boolean value) {
		CONFIG.setShowItunesLibrary(value);
	}

	@WebMethod()
	public boolean isHideAdvancedOptions() {
		return CONFIG.isHideAdvancedOptions();
	}

	@WebMethod()
	public void setHideAdvancedOptions(@WebParam(name = "value") boolean value) {
		CONFIG.setHideAdvancedOptions(value);
	}

	@WebMethod()
	public boolean isHideEmptyFolders() {
		return CONFIG.isHideEmptyFolders();
	}

	@WebMethod()
	public void setHideEmptyFolders(@WebParam(name = "value") boolean value) {
		CONFIG.setHideEmptyFolders(value);
	}

	@WebMethod()
	public boolean isHideMediaLibraryFolder() {
		return CONFIG.isHideMediaLibraryFolder();
	}

	@WebMethod()
	public void setHideMediaLibraryFolder(@WebParam(name = "value") boolean value) {
		CONFIG.setHideMediaLibraryFolder(value);
	}

	@WebMethod()
	public boolean getHideTranscodeEnabled() {
		return CONFIG.getHideTranscodeEnabled();
	}

	@WebMethod()
	public void setHideTranscodeEnabled(@WebParam(name = "value") boolean value) {
		CONFIG.setHideTranscodeEnabled(value);
	}

	@WebMethod()
	public boolean isDvdIsoThumbnails() {
		return CONFIG.isDvdIsoThumbnails();
	}

	@WebMethod()
	public void setDvdIsoThumbnails(@WebParam(name = "value") boolean value) {
		CONFIG.setDvdIsoThumbnails(value);
	}

	// @WebMethod()
	// public Object getCustomProperty(@WebParam(name="property")String
	// property) {
	// return CONFIG.getCustomProperty(property);
	// }

	// @WebMethod()
	// public void setCustomProperty(String property, Object value) {
	// CONFIG.setCustomProperty(property, value);
	// }

	@WebMethod()
	public boolean isChapterSupport() {
		return CONFIG.isChapterSupport();
	}

	@WebMethod()
	public void setChapterSupport(@WebParam(name = "value") boolean value) {
		CONFIG.setChapterSupport(value);
	}

	@WebMethod()
	public int getChapterInterval() {
		return CONFIG.getChapterInterval();
	}

	@WebMethod()
	public void setChapterInterval(@WebParam(name = "value") int value) {
		CONFIG.setChapterInterval(value);
	}

	@WebMethod()
	public int getSubsColor() {
		return CONFIG.getSubsColor();
	}

	@WebMethod()
	public void setSubsColor(@WebParam(name = "value") int value) {
		CONFIG.setSubsColor(value);
	}

	@WebMethod()
	public boolean isFix25FPSAvMismatch() {
		return CONFIG.isFix25FPSAvMismatch();
	}

	@WebMethod()
	public void setFix25FPSAvMismatch(@WebParam(name = "value") boolean value) {
		CONFIG.setFix25FPSAvMismatch(value);
	}

	@WebMethod()
	public int getVideoTranscodeStartDelay() {
		return CONFIG.getVideoTranscodeStartDelay();
	}

	@WebMethod()
	public void setVideoTranscodeStartDelay(@WebParam(name = "value") int value) {
		CONFIG.setVideoTranscodeStartDelay(value);
	}

	@WebMethod()
	public boolean isAudioResample() {
		return CONFIG.isAudioResample();
	}

	@WebMethod()
	public void setAudioResample(@WebParam(name = "value") boolean value) {
		CONFIG.setAudioResample(value);
	}

	@WebMethod()
	public boolean isIgnoreTheWordThe() {
		return CONFIG.isIgnoreTheWordThe();
	}

	@WebMethod()
	public void setIgnoreTheWordThe(@WebParam(name = "value") boolean value) {
		CONFIG.setIgnoreTheWordThe(value);
	}

	@WebMethod()
	public boolean isPrettifyFilenames() {
		return CONFIG.isPrettifyFilenames();
	}

	@WebMethod()
	public void setPrettifyFilenames(@WebParam(name = "value") boolean value) {
		CONFIG.setPrettifyFilenames(value);
	}

	@WebMethod()
	public boolean isUseInfoFromIMDB() {
		return CONFIG.isUseInfoFromIMDB();
	}

	@WebMethod()
	public void setUseInfoFromIMDB(@WebParam(name = "value") boolean value) {
		CONFIG.setUseInfoFromIMDB(value);
	}

	@WebMethod()
	public boolean isRunWizard() {
		return CONFIG.isRunWizard();
	}

	@WebMethod()
	public void setRunWizard(@WebParam(name = "value") boolean value) {
		CONFIG.setRunWizard(value);
	}

	@WebMethod()
	public boolean isHideNewMediaFolder() {
		return CONFIG.isHideNewMediaFolder();
	}

	@WebMethod()
	public void setHideNewMediaFolder(@WebParam(name = "value") boolean value) {
		CONFIG.setHideNewMediaFolder(value);
	}

	@WebMethod()
	public boolean isHideRecentlyPlayedFolder() {
		return CONFIG.isHideRecentlyPlayedFolder();
	}

	@WebMethod()
	public void setHideRecentlyPlayedFolder(@WebParam(name = "value") boolean value) {
		CONFIG.setHideRecentlyPlayedFolder(value);
	}

	@WebMethod()
	public String getRendererDefault() {
		return CONFIG.getRendererDefault();
	}

	@WebMethod()
	public void setRendererDefault(@WebParam(name = "value") String value) {
		CONFIG.setRendererDefault(value);
	}

	@WebMethod()
	public boolean isRendererForceDefault() {
		return CONFIG.isRendererForceDefault();
	}

	@WebMethod()
	public void setRendererForceDefault(@WebParam(name = "value") boolean value) {
		CONFIG.setRendererForceDefault(value);
	}

	@WebMethod()
	public String getVirtualFolders(@WebParam(name = "tags") ArrayList<String> tags) {
		return CONFIG.getVirtualFolders(tags);
	}

	@WebMethod()
	public String getVirtualFoldersFile(@WebParam(name = "tags") ArrayList<String> tags) {
		return CONFIG.getVirtualFoldersFile(tags);
	}

	@WebMethod()
	public String getProfilePath() {
		return CONFIG.getProfilePath();
	}

	@WebMethod()
	public String getProfileDirectory() {
		return CONFIG.getProfileDirectory();
	}

	@WebMethod()
	public String getWebConfPath() {
		return CONFIG.getWebConfPath();
	}

	@WebMethod()
	public String getPluginDirectory() {
		return CONFIG.getPluginDirectory();
	}

	@WebMethod()
	public void setPluginDirectory(@WebParam(name = "value") String value) {
		CONFIG.setPluginDirectory(value);
	}

	@WebMethod()
	public String getProfileName() {
		return CONFIG.getProfileName();
	}

	@WebMethod()
	public boolean isAutoUpdate() {
		return CONFIG.isAutoUpdate();
	}

	@WebMethod()
	public void setAutoUpdate(@WebParam(name = "value") boolean value) {
		CONFIG.setAutoUpdate(value);
	}

	@WebMethod()
	public int getUpnpPort() {
		return CONFIG.getUpnpPort();
	}

	@WebMethod()
	public String getUuid() {
		return CONFIG.getUuid();
	}

	@WebMethod()
	public void setUuid(@WebParam(name = "value") String value) {
		CONFIG.setUuid(value);
	}

	@WebMethod()
	public boolean getFolderLimit() {
		return CONFIG.getFolderLimit();
	}

	@WebMethod()
	public String getScriptDir() {
		return CONFIG.getScriptDir();
	}

	@WebMethod()
	public String getPluginPurgeAction() {
		return CONFIG.getPluginPurgeAction();
	}

	@WebMethod()
	public boolean getSearchFolder() {
		return CONFIG.getSearchFolder();
	}

	@WebMethod()
	public boolean getSearchInFolder() {
		return CONFIG.getSearchInFolder();
	}

	@WebMethod()
	public int getSearchDepth() {
		return CONFIG.getSearchDepth();
	}

	@WebMethod()
	public void reload() {
		CONFIG.reload();
	}

	@WebMethod()
	public String getTranscodeFolderName() {
		return CONFIG.getTranscodeFolderName();
	}

	@WebMethod()
	public void setTranscodeFolderName(@WebParam(name = "name") String name) {
		CONFIG.setTranscodeFolderName(name);
	}

	@WebMethod()
	public boolean isGPUAcceleration() {
		return CONFIG.isGPUAcceleration();
	}

	@WebMethod()
	public void setGPUAcceleration(boolean value) {
		CONFIG.setGPUAcceleration(value);
	}

	@WebMethod()
	public boolean getGUILogSearchCaseSensitive() {
		return CONFIG.getGUILogSearchCaseSensitive();
	}

	@WebMethod()
	public void setGUILogSearchCaseSensitive(@WebParam(name = "value") boolean value) {
		CONFIG.setGUILogSearchCaseSensitive(value);
	}

	@WebMethod()
	public boolean getGUILogSearchMultiLine() {
		return CONFIG.getGUILogSearchMultiLine();
	}

	@WebMethod()
	public void setGUILogSearchMultiLine(@WebParam(name = "value") boolean value) {
		CONFIG.setGUILogSearchMultiLine(value);
	}

	@WebMethod()
	public boolean getGUILogSearchRegEx() {
		return CONFIG.getGUILogSearchRegEx();
	}

	@WebMethod()
	public void setGUILogSearchRegEx(@WebParam(name = "value") boolean value) {
		CONFIG.setGUILogSearchRegEx(value);
	}

	@WebMethod()
	public boolean isAdmin() {
		return CONFIG.isAdmin();
	}

	@WebMethod()
	public boolean getExternalNetwork() {
		return CONFIG.getExternalNetwork();
	}

	@WebMethod()
	public void setExternalNetwork(@WebParam(name = "value") boolean value) {
		CONFIG.setExternalNetwork(value);
	}

	@WebMethod()
	public void initCred() throws IOException {
		CONFIG.initCred();
	}

	@WebMethod()
	public String getCredPath() {
		return CONFIG.getCredPath();
	}

	@WebMethod()
	public int getATZLimit() {
		return CONFIG.getATZLimit();
	}

	@WebMethod()
	public void setATZLimitInteger(@WebParam(name = "value") int value) {
		CONFIG.setATZLimit(value);
	}

	@WebMethod()
	public void setATZLimitString(@WebParam(name = "value") String value) {
		CONFIG.setATZLimit(value);
	}

	@WebMethod()
	public String getDataDir() {
		return CONFIG.getDataDir();
	}

	@WebMethod()
	public String getDataFile(@WebParam(name = "value") String value) {
		return CONFIG.getDataFile(value);
	}

	@WebMethod()
	public String[] getURLResolveOrder() {
		return CONFIG.getURLResolveOrder();
	}

	@WebMethod()
	public boolean isHideLiveSubtitlesFolder() {
		return CONFIG.isHideLiveSubtitlesFolder();
	}

	@WebMethod()
	public void setHideLiveSubtitlesFolder(@WebParam(name = "value") boolean value) {
		CONFIG.setHideLiveSubtitlesFolder(value);
	}

	@WebMethod()
	public int liveSubtitlesLimit() {
		return CONFIG.liveSubtitlesLimit();
	}

	@WebMethod()
	public boolean isLiveSubtitlesKeep() {
		return CONFIG.isLiveSubtitlesKeep();
	}

	@WebMethod()
	public int getLiveSubtitlesTimeout() {
		return CONFIG.getLiveSubtitlesTimeout();
	}

	@WebMethod()
	public void setLiveSubtitlesTimeout(@WebParam(name = "value") int value) {
		CONFIG.setLiveSubtitlesTimeout(value);
	}

	@WebMethod()
	public boolean getLoggingBuffered() {
		return CONFIG.getLoggingBuffered();
	}

	@WebMethod()
	public void setLoggingBuffered(@WebParam(name = "value") boolean value) {
		CONFIG.setLoggingBuffered(value);
	}

	// @WebMethod()
	// public Level getLoggingFilterConsole() {
	// return CONFIG.getLoggingFilterConsole();
	// }

	// @WebMethod()
	// public void setLoggingFilterConsole(@WebParam(name="value")Level value) {
	// CONFIG.setLoggingFilterConsole(value);
	// }
	//

	// @WebMethod()
	// public Level getLoggingFilterLogsTab() {
	// return Level.toLevel(getString(KEY_LOGGING_FILTER_LOGS_TAB, "INFO"),
	// Level.INFO);
	// }

	// @WebMethod()
	// public void setLoggingFilterLogsTab(Level value) {
	// configuration.setProperty(KEY_LOGGING_FILTER_LOGS_TAB, value.levelStr);
	// }

	@WebMethod()
	public int getLoggingLogsTabLinebuffer() {
		return CONFIG.getLoggingLogsTabLinebuffer();
	}

	@WebMethod()
	public void setLoggingLogsTabLinebuffer(@WebParam(name = "value") int value) {
		CONFIG.setLoggingLogsTabLinebuffer(value);
	}

	@WebMethod()
	public String getLoggingSyslogFacility() {
		return CONFIG.getLoggingSyslogFacility();
	}

	@WebMethod()
	public void setLoggingSyslogFacility(@WebParam(name = "value") String value) {
		CONFIG.setLoggingSyslogFacility(value);
	}

	@WebMethod()
	public void setLoggingSyslogFacilityDefault() {
		CONFIG.setLoggingSyslogFacilityDefault();
	}

	@WebMethod()
	public String getLoggingSyslogHost() {
		return CONFIG.getLoggingSyslogHost();
	}

	@WebMethod()
	public void setLoggingSyslogHost(@WebParam(name = "value") String value) {
		CONFIG.setLoggingSyslogHost(value);
	}

	@WebMethod()
	public int getLoggingSyslogPort() {
		return CONFIG.getLoggingSyslogPort();
	}

	@WebMethod()
	public void setLoggingSyslogPort(@WebParam(name = "value") int value) {
		CONFIG.setLoggingSyslogPort(value);
	}

	@WebMethod()
	public void setLoggingSyslogPortDefault() {
		CONFIG.setLoggingSyslogPortDefault();
	}

	@WebMethod()
	public boolean getLoggingUseSyslog() {
		return CONFIG.getLoggingUseSyslog();
	}

	@WebMethod()
	public void setLoggingUseSyslog(@WebParam(name = "value") boolean value) {
		CONFIG.setLoggingUseSyslog(value);
	}

	@WebMethod()
	public boolean isVlcUseHardwareAccel() {
		return CONFIG.isVlcUseHardwareAccel();
	}

	@WebMethod()
	public void setVlcUseHardwareAccel(@WebParam(name = "value") boolean value) {
		CONFIG.setVlcUseHardwareAccel(value);
	}

	@WebMethod()
	public boolean isVlcExperimentalCodecs() {
		return CONFIG.isVlcExperimentalCodecs();
	}

	@WebMethod()
	public void setVlcExperimentalCodecs(@WebParam(name = "value") boolean value) {
		CONFIG.setVlcExperimentalCodecs(value);
	}

	@WebMethod()
	public boolean isVlcAudioSyncEnabled() {
		return CONFIG.isVlcAudioSyncEnabled();
	}

	@WebMethod()
	public void setVlcAudioSyncEnabled(@WebParam(name = "value") boolean value) {
		CONFIG.setVlcAudioSyncEnabled(value);
	}

	@WebMethod()
	public boolean isVlcSubtitleEnabled() {
		return CONFIG.isVlcSubtitleEnabled();
	}

	@WebMethod()
	public void setVlcSubtitleEnabled(@WebParam(name = "value") boolean value) {
		CONFIG.setVlcSubtitleEnabled(value);
	}

	@WebMethod()
	public String getVlcScale() {
		return CONFIG.getVlcScale();
	}

	@WebMethod()
	public void setVlcScale(@WebParam(name = "value") String value) {
		CONFIG.setVlcScale(value);
	}

	@WebMethod()
	public boolean getVlcSampleRateOverride() {
		return CONFIG.getVlcSampleRateOverride();
	}

	@WebMethod()
	public void setVlcSampleRateOverride(@WebParam(name = "value") boolean value) {
		CONFIG.setVlcSampleRateOverride(value);
	}

	@WebMethod()
	public String getVlcSampleRate() {
		return CONFIG.getVlcSampleRate();
	}

	@WebMethod()
	public void setVlcSampleRate(@WebParam(name = "value") String value) {
		CONFIG.setVlcSampleRate(value);
	}

	@WebMethod()
	public boolean isResumeEnabled() {
		return CONFIG.isResumeEnabled();
	}

	@WebMethod()
	public void setResume(@WebParam(name = "value") boolean value) {
		CONFIG.setResume(value);
	}

	@WebMethod()
	public int getMinPlayTime() {
		return CONFIG.getMinPlayTime();
	}

	@WebMethod()
	public int getMinPlayTimeWeb() {
		return CONFIG.getMinPlayTimeWeb();
	}

	@WebMethod()
	public int getMinPlayTimeFile() {
		return CONFIG.getMinPlayTimeFile();
	}

	@WebMethod()
	public int getResumeRewind() {
		return CONFIG.getResumeRewind();
	}

	@WebMethod()
	public double getResumeBackFactor() {
		return CONFIG.getResumeBackFactor();
	}

	@WebMethod()
	public int getResumeKeepTime() {
		return CONFIG.getResumeKeepTime();
	}

	@WebMethod()
	public boolean hideSubsInfo() {
		return CONFIG.hideSubsInfo();
	}

	@WebMethod()
	public String getPlugins(@WebParam(name = "tags") ArrayList<String> tags) {
		return CONFIG.getPlugins(tags);
	}

	@WebMethod()
	public boolean isHideWebFolder(@WebParam(name = "tags") ArrayList<String> tags) {
		return CONFIG.isHideWebFolder(tags);
	}

	@WebMethod()
	public boolean isAppendProfileName() {
		return CONFIG.isAppendProfileName();
	}

	@WebMethod()
	public void setAppendProfileName(@WebParam(name = "value") boolean value) {
		CONFIG.setAppendProfileName(value);
	}

	@WebMethod()
	public String getDepth3D() {
		return CONFIG.getDepth3D();
	}

	@WebMethod()
	public void setDepth3D(@WebParam(name = "value") String value) {
		CONFIG.setDepth3D(value);
	}

	@WebMethod()
	public void setSingle(@WebParam(name = "value") boolean value) {
		CONFIG.setSingle(value);
	}

	@WebMethod()
	public void setRunSingleInstance(@WebParam(name = "value") boolean value) {
		CONFIG.setRunSingleInstance(value);
	}

	@WebMethod()
	public boolean getSingle() {
		return CONFIG.getSingle();
	}

	@WebMethod()
	public boolean isRunSingleInstance() {
		return CONFIG.isRunSingleInstance();
	}

	@WebMethod()
	public boolean getNoFolders(@WebParam(name = "tag") String tag) {
		return CONFIG.getNoFolders(tag);
	}

	@WebMethod()
	public boolean getWebHttps() {
		return CONFIG.getWebHttps();
	}

	@WebMethod()
	public File getWebPath() {
		return CONFIG.getWebPath();
	}

	// @WebMethod()
	// public File getWebFile(@WebParam(name = "file") String file) {
	// return CONFIG.getWebFile(file);
	// }

	@WebMethod()
	public boolean isWebAuthenticate() {
		return CONFIG.isWebAuthenticate();
	}

	@WebMethod()
	public int getWebThreads() {
		return CONFIG.getWebThreads();
	}

	@WebMethod()
	public boolean isWebMp4Trans() {
		return CONFIG.isWebMp4Trans();
	}

	@WebMethod()
	public String getBumpAddress() {
		return CONFIG.getBumpAddress();
	}

	@WebMethod()
	public void setBumpAddress(@WebParam(name = "value") String value) {
		CONFIG.setBumpAddress(value);
	}

	@WebMethod()
	public String getBumpJS(@WebParam(name = "fallback") String fallback) {
		return CONFIG.getBumpJS(fallback);
	}

	@WebMethod()
	public String getBumpSkinDir(@WebParam(name = "fallback") String fallback) {
		return CONFIG.getBumpSkinDir(fallback);
	}

	@WebMethod()
	public int getWebPort() {
		return CONFIG.getWebPort();
	}

	@WebMethod()
	public boolean useWebInterface() {
		return CONFIG.useWebInterface();
	}

	@WebMethod()
	public boolean isAutomaticMaximumBitrate() {
		return CONFIG.isAutomaticMaximumBitrate();
	}

	@WebMethod()
	public void setAutomaticMaximumBitrate(@WebParam(name = "value") boolean value) {
		CONFIG.setAutomaticMaximumBitrate(value);
	}

	@WebMethod()
	public String pingPath() {
		return CONFIG.pingPath();
	}

	@WebMethod()
	public boolean isSpeedDbg() {
		return CONFIG.isSpeedDbg();
	}

	@WebMethod()
	public boolean getAutoDiscover() {
		return CONFIG.getAutoDiscover();
	}

	@WebMethod()
	public int mediaLibrarySort() {
		return CONFIG.mediaLibrarySort();
	}

	// @WebMethod()
	// public boolean getWebAutoCont(@WebParam(name = "format") Format format) {
	// return CONFIG.getWebAutoCont(format);
	// }

	// @WebMethod()
	// public boolean getWebAutoLoop(@WebParam(name = "format") Format format) {
	// return CONFIG.get(format);
	// }

	@WebMethod()
	public int getWebImgSlideDelay() {
		return CONFIG.getWebImgSlideDelay();
	}

	@WebMethod()
	public String getWebSize() {
		return CONFIG.getWebSize();
	}

	@WebMethod()
	public int getWebHeight() {
		return CONFIG.getWebHeight();
	}

	@WebMethod()
	public int getWebWidth() {
		return CONFIG.getWebWidth();
	}

	@WebMethod()
	public boolean getWebFlash() {
		return CONFIG.getWebFlash();
	}

	@WebMethod()
	public boolean getWebChrome() {
		return CONFIG.getWebChrome();
	}

	@WebMethod()
	public boolean getWebFirefoxLinuxMp4() {
		return CONFIG.getWebFirefoxLinuxMp4();
	}

	@WebMethod()
	public boolean getWebSubs() {
		return CONFIG.getWebSubs();
	}

	@WebMethod()
	public String getBumpAllowedIps() {
		return CONFIG.getBumpAllowedIps();
	}

	@WebMethod()
	public String getWebTranscode() {
		return CONFIG.getWebTranscode();
	}

	@WebMethod()
	public int getWebLowSpeed() {
		return CONFIG.getWebLowSpeed();
	}

	@WebMethod()
	public boolean useWebLang() {
		return CONFIG.useWebLang();
	}

	@WebMethod()
	public boolean useWebSubLang() {
		return CONFIG.useWebSubLang();
	}

	@WebMethod()
	public boolean useWebControl() {
		return CONFIG.useWebControl();
	}

	@WebMethod()
	public boolean useCode() {
		return CONFIG.useCode();
	}

	@WebMethod()
	public int getCodeValidTmo() {
		return CONFIG.getCodeValidTmo();
	}

	@WebMethod()
	public boolean isShowCodeThumbs() {
		return CONFIG.isShowCodeThumbs();
	}

	@WebMethod()
	public int getCodeCharSet() {
		return CONFIG.getCodeCharSet();
	}

	@WebMethod()
	public boolean isDynamicPls() {
		return CONFIG.isDynamicPls();
	}

	@WebMethod()
	public boolean isDynamicPlsAutoSave() {
		return CONFIG.isDynamicPlsAutoSave();
	}

	@WebMethod()
	public String getDynamicPlsSavePath() {
		return CONFIG.getDynamicPlsSavePath();
	}

	@WebMethod()
	public String getDynamicPlsSaveFile(@WebParam(name = "value") String value) {
		return CONFIG.getDynamicPlsSaveFile(value);
	}

	@WebMethod()
	public boolean isHideSavedPlaylistFolder() {
		return CONFIG.isHideSavedPlaylistFolder();
	}

	@WebMethod()
	public boolean isAutoContinue() {
		return CONFIG.isAutoContinue();
	}

	@WebMethod()
	public boolean isAutoAddAll() {
		return CONFIG.isAutoAddAll();
	}

	@WebMethod()
	public String getAutoPlay() {
		return CONFIG.getAutoPlay();
	}

	@WebMethod()
	public boolean useChromecastExt() {
		return CONFIG.useChromecastExt();
	}

	@WebMethod()
	public boolean isChromecastDbg() {
		return CONFIG.isChromecastDbg();
	}

	// @WebMethod()
	// public Color getToolTipForegroundColor() {
	// return CONFIG.getToolTipForegroundColor();
	// }

	// @WebMethod()
	// public Color getToolTipBackgroundColor() {
	// return CONFIG.getToolTipBackgroundColor();
	// }

	@WebMethod()
	public void setAutoSave() {
		CONFIG.setAutoSave();
	}

	@WebMethod()
	public boolean isUpnpEnabled() {
		return CONFIG.isUpnpEnabled();
	}

	@WebMethod()
	public String getRootLogLevel() {
		return CONFIG.getRootLogLevel();
	}

	// @WebMethod()
	// public void setRootLogLevel(@WebParam(name = "level") ch.qos.logback.classic.Level level) {
	// CONFIG.setRootLogLevel(value);
	// }

	@WebMethod()
	public void setWindowGeometry(@WebParam(name = "value") String value) {
		CONFIG.setWindowGeometry(value);
	}

	@WebMethod()
	public String getWindowGeometry() {
		return CONFIG.getWindowGeometry();
	}

	@WebMethod()
	public void setScreenSize(@WebParam(name = "value") String value) {
		CONFIG.setScreenSize(value);
	}

	@WebMethod()
	public String getScreenSize() {
		return CONFIG.getScreenSize();
	}
}